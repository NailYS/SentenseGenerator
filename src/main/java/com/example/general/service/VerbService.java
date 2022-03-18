package com.example.general.service;

import com.example.general.model.Verb;

import java.util.List;

public interface VerbService {
    List<Verb> getAllVerb();

    Verb addVerb(Verb verb);

}
