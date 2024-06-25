package com.example.surround.service;

import com.example.surround.model.SurroundUrl;
import com.example.surround.repository.SurroundUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SurroundUrlService {

    private final SurroundUrlRepository repository;

    @Autowired
    public SurroundUrlService(SurroundUrlRepository repository) {
        this.repository = repository;
    }

    public List<SurroundUrl> getAllSurroundUrls() {
        return repository.findAll();  // Directly return the list
    }

    public SurroundUrl saveSurroundUrl(SurroundUrl surroundUrl) {
        return repository.save(surroundUrl);
    }
}
