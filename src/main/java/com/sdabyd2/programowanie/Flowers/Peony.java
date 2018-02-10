package com.sdabyd2.programowanie.Flowers;

import com.sdabyd2.programowanie.Shop.PriceList;

public class Peony extends Flowers {

    public Peony(int quantity, ColorOfFlowers colorOfFlowers){
        super(quantity, colorOfFlowers);
        setName("peony");
        if (PriceList.getSetKeys().contains(getName())) {
            setPrice(PriceList.getHashMap().get(getName()));
        }else {
            setPrice(0);
        }
    }
}
