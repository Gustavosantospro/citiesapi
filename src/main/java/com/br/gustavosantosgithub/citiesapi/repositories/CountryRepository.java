package com.br.gustavosantosgithub.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gustavosantosgithub.citiesapi.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
