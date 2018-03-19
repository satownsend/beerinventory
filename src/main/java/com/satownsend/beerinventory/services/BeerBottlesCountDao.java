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
//        Optional<BeerBottlesCount> op = repo.findById(id);
//        return op.get();
        return repo.findById(id).get();
    }

    public BeerBottlesCount save(BeerBottlesCount a) {
        System.out.println("Saving...");
        return repo.save(a);
    }
}

/*
public class OldBeerBottlesCountRepository {

    private Long idCounter = 1L;

    private Map<Long,BeerBottlesCount> database = new HashMap<Long,BeerBottlesCount>();

    public BeerBottlesCount findById(Long id) {
        return database.get(id);
    }

    public BeerBottlesCount save(BeerBottlesCount a) {

        if (a.getId() == null) {
            a.setId(idCounter++);
        }

        database.put(a.getId(), a);

        return a;
    }

 */

//    Database access object