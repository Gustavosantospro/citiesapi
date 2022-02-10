package com.br.gustavosantosgithub.citiesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.gustavosantosgithub.citiesapi.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

            @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id=?1) <@> (SELECT lat_lon FROM cidade where id=?2)) as distance", nativeQuery = true)
            Double distanceByPoints(final Long cityId1, final Long cityid2);

            @Query(value = "SELECT ((SELECT earth_distance(ll_toearth(?1, ?2), ll_to_earth(73,74) as distance", nativeQuery = true)
            Double distanceByCube(final Double lat1, final Double lon1, final Double lat2, final Double lon2);



}
