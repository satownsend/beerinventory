package com.satownsend.beerinventory.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BeerBottlesCount implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bottles")
    private Integer bottles;

    @Column(name = "beerBrand")
    private String beerBrand;

    @Column(name = "beerName")
    private String beerName;

    public BeerBottlesCount() {
    }

    public Integer getBottles() {
        return bottles;
    }
    public void setBottles(Integer bottles) {
        this.bottles = bottles;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBeerBrand() {
        return beerBrand;
    }
    public void setBeerBrand(String beerBrand) {
        this.beerBrand = beerBrand;
    }
    public String getBeerName() {
        return beerName;
    }
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }
}