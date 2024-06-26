package com.example.surround.controller;

import com.example.surround.model.SurroundUrl;
import com.example.surround.service.SurroundUrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.OPTIONS })
@Validated
public class SurroundUrlController {

    private final SurroundUrlService service;
    private static final Logger logger = LoggerFactory.getLogger(SurroundUrlController.class);

    @Autowired
    public SurroundUrlController(SurroundUrlService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/url")
    public List<SurroundUrl> getSurroundUrls() {
        logger.info("Fetching all surround URLs");
        return service.getAllSurroundUrls();
    }

    @PostMapping("/api/v1/url")
    public SurroundUrl createSurroundUrl(@Valid @RequestBody SurroundUrl surroundUrl) {
        logger.info("Creating a new surround URL: {}", surroundUrl);
        return service.saveSurroundUrl(surroundUrl);
    }
}
