package com.example.general.repository;

import com.example.general.model.Verb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VerbRepository extends CrudRepository<Verb, Long> {
    List<Verb> findAll();
}
