package com.satownsend.beerinventory.rest;

import com.satownsend.beerinventory.model.BeerBottlesCount;
import com.satownsend.beerinventory.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeerBottlesCountController {

    @Autowired
    private InventoryService inventoryService;
    @GetMapping("/findById/{id}")
    public BeerBottlesCount findById(
            @PathVariable(value="id") Long id) {
        return inventoryService.findById(id);
    }

    @PostMapping("/save")
    public BeerBottlesCount save(
            @RequestBody BeerBottlesCount a) {
        return inventoryService.save(a);
    }

    @GetMapping("/drinkABeer/{id}")
    public BeerBottlesCount drinkABeer(
            @PathVariable(value="id") Long id) {
        return inventoryService.drinkABeer(id);
    }

    @GetMapping("/drinkABeerSafe/{id}")
    public BeerBottlesCount drinkABeerSafe(
            @PathVariable(value="id") Long id) {
        return inventoryService.drinkABeerSafe(id);
    }

}