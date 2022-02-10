package com.br.gustavosantosgithub.citiesapi.resources;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.gustavosantosgithub.citiesapi.model.City;
import com.br.gustavosantosgithub.citiesapi.repositories.CityRepository;




@RestController
@RequestMapping("/cities")
public class CityResource {

    private CityRepository repository;

    public CityResource(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }
}
