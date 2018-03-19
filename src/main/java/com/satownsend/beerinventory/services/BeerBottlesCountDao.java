package com.satownsend.beerinventory.services;
import com.satownsend.beerinventory.model.BeerBottlesCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerBottlesCountDao {

    @Autowired
    private OldBeerBottlesCountRepository repo;

    public BeerBottlesCount findById(Long id) {
        return repo.findById(id);
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