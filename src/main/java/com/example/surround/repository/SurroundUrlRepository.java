package com.example.surround.repository;

import com.example.surround.model.SurroundUrl;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurroundUrlRepository extends JpaRepository<SurroundUrl, Integer> {
}
