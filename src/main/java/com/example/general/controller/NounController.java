package com.example.general.controller;

import com.example.general.model.Noun;
import com.example.general.service.NounService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noun")
@RequiredArgsConstructor
public class NounController {

    private final NounService nounService;

    @GetMapping
    public String getNoun() {
        return nounService.getAllNoun();
    }

    @PostMapping()
    public Noun createNoun(@RequestBody Noun noun) {
        return nounService.addNoun(noun);
    }
}
