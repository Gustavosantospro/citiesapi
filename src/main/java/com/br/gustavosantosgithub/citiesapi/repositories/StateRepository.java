package com.br.gustavosantosgithub.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gustavosantosgithub.citiesapi.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
