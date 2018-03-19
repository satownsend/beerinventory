package com.satownsend.beerinventory.services;
import com.satownsend.beerinventory.model.BeerBottlesCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private BeerBottlesCountDao dao;

    public BeerBottlesCount findById(Long id) {
        return dao.findById(id);
    }

    public BeerBottlesCount save(BeerBottlesCount a) {
        return dao.save(a);
    }

    public BeerBottlesCount drinkABeer(Long id) {
        BeerBottlesCount b = dao.findById(id);
        b.setBottles(b.getBottles() - 1);
        return dao.save(b);
    }

    public BeerBottlesCount drinkABeerSafe(Long id) {
        BeerBottlesCount b = dao.findById(id);
        if (b.getBottles() > 0) {
            b.setBottles(b.getBottles() - 1);
        }
            return dao.save(b);
    }
}



