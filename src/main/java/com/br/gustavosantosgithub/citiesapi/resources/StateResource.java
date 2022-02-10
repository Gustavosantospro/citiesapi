package com.br.gustavosantosgithub.citiesapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.gustavosantosgithub.citiesapi.model.State;
import com.br.gustavosantosgithub.citiesapi.repositories.StateRepository;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {
    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}
