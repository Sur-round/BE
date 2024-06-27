package com.example.surround.controller;

import com.example.surround.model.SurroundSite;
import com.example.surround.service.SurroundSiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.PATCH, RequestMethod.OPTIONS })
@Validated
@RequestMapping("/api/v1")
public class SurroundSiteController {

    private final SurroundSiteService service;
    private static final Logger logger = LoggerFactory.getLogger(SurroundSiteController.class);

    @Autowired
    public SurroundSiteController(SurroundSiteService service) {
        this.service = service;
    }

    @GetMapping("/sites")
    public List<SurroundSite> getSurroundSites(@RequestParam(required = false) String category) {
        if (category != null) {
            logger.info("Fetching surround sites by category: {}", category);
            return service.getSurroundSitesByCategory(category);
        } else {
            logger.info("Fetching all surround sites");
            return service.getAllSurroundSites();
        }
    }

    @PostMapping("/sites")
    public SurroundSite createSurroundSite(@RequestBody SurroundSite surroundSite) {
        logger.info("Creating a new surround site: {}", surroundSite);
        return service.saveSurroundSite(surroundSite);
    }
}
