package com.satownsend.beerinventory.services;
import com.satownsend.beerinventory.model.BeerBottlesCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BeerBottlesCountDao {

    @Autowired
    private BeerBottlesCountRepository repo;

    public BeerBottlesCount findById(Long id) {
        return repo.findById(id).get();
    }

    public BeerBottlesCount save(BeerBottlesCount a) {
        System.out.println("Saving...");
        return repo.save(a);
    }
}