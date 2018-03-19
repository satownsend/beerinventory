package com.satownsend.beerinventory.services;
import com.satownsend.beerinventory.model.BeerBottlesCount;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
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

}
//    create 2 methods findById    take a long id    return repo.findById(Id)