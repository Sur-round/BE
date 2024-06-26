package com.example.surround.repository;

import com.example.surround.model.SurroundSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurroundSiteRepository extends JpaRepository<SurroundSite, Integer> {
    List<SurroundSite> findByCategory(String category);
}
