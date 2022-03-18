package com.example.general.service.impl;

import com.example.general.model.Noun;
import com.example.general.model.Verb;
import com.example.general.repository.NounRepository;
import com.example.general.repository.VerbRepository;
import com.example.general.service.NounService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class NounServiceImpl implements NounService {

    private final NounRepository nounRepository;
    private final VerbRepository verbRepository;

    @Override
    public String getAllNoun() {
        Random random = new Random();
        List<Noun> nounList = nounRepository.findAll();
        List<Verb> verbList = verbRepository.findAll();
        int index = random.nextInt(nounList.size());
        int index2 = random.nextInt(verbList.size());
        Noun res1 = nounList.get(index);
        Verb res2 = verbList.get(index2);
        String noun = res1.getNoun();
        String verb = res2.getVerb();
        String sentence = noun + " " + verb;
        return sentence;
    }

    @Override
    public Noun addNoun(Noun noun) {
        return nounRepository.save(noun);
    }
}
