package com.github.ricardoal.states.repositories;

import com.github.ricardoal.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
