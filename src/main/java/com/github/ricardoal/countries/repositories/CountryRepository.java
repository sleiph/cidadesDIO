package com.github.ricardoal.countries.repositories;

import com.github.ricardoal.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
