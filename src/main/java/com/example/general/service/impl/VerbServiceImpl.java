package com.example.general.service.impl;

import com.example.general.model.Verb;
import com.example.general.repository.VerbRepository;
import com.example.general.service.VerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VerbServiceImpl implements VerbService {
    private final VerbRepository verbRepository;

    @Override
    public List<Verb> getAllVerb() {
        return verbRepository.findAll();
    }

    @Override
    public Verb addVerb(Verb verb) {
        return verbRepository.save(verb);
    }
}
