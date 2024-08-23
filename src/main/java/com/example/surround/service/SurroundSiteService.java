package com.example.surround.service;

import com.example.surround.model.SurroundSite;
import com.example.surround.repository.SurroundSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurroundSiteService {

    private final SurroundSiteRepository repository;

    @Autowired
    public SurroundSiteService(SurroundSiteRepository repository) {
        this.repository = repository;
    }

    public List<SurroundSite> getAllSurroundSites() {
        return repository.findAll();
    }

    public SurroundSite saveSurroundSite(SurroundSite surroundSite) {
        return repository.save(surroundSite);
    }

    public List<SurroundSite> getSurroundSitesByCategory(String category) {
        return repository.findByCategory(category);
    }
}
