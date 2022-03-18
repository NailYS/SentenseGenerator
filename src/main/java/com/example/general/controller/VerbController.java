package com.example.general.controller;

import com.example.general.model.Verb;
import com.example.general.service.VerbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/verb")
@RequiredArgsConstructor

public class VerbController {

    private final VerbService verbService;

    @GetMapping
    public List<Verb> getAllVerbs() {
        return verbService.getAllVerb();
    }

    @PostMapping()
    public Verb createVerb(@RequestBody Verb verb) {
        return verbService.addVerb(verb);
    }
}
