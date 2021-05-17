package com.freedom4hooray.ty1hcpage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wyl
 */
@RestController
public class RandomCodeController {

    @GetMapping("")
    public ResponseEntity randomCode() {
        return ResponseEntity.ok(UUID.randomUUID().toString());
    }
}
