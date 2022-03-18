package com.example.general.repository;

import com.example.general.model.Noun;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NounRepository extends CrudRepository<Noun, Long> {
    List<Noun> findAll();
}
