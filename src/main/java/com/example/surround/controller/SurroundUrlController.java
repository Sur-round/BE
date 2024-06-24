package com.example.surround.controller;

import com.example.surround.model.SurroundUrl;
import com.example.surround.service.SurroundUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://surround-bucket.s3-website-ap-northeast-2.amazonaws.com")
// 허용할 출처 지정
public class SurroundUrlController {

    @Autowired
    private SurroundUrlService service;

    @GetMapping("/api/data")
    public List<SurroundUrl> getSurroundUrls() {
        return service.getAllSurroundUrls();
    }

    @PostMapping("/api/data")
    public SurroundUrl createSurroundUrl(@RequestBody SurroundUrl surroundUrl) {
        return service.saveSurroundUrl(surroundUrl);
    }
}
