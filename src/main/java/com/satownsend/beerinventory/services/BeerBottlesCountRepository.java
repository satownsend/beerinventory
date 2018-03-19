package com.satownsend.beerinventory.services;

import com.satownsend.beerinventory.model.BeerBottlesCount;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BeerBottlesCountRepository extends CrudRepository<BeerBottlesCount, Long> {
    Optional<BeerBottlesCount> findById(Long id);
}