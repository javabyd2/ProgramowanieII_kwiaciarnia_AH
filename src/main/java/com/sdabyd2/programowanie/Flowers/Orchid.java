package com.sdabyd2.programowanie.Flowers;

import com.sdabyd2.programowanie.Shop.PriceList;

public class Orchid extends Flowers {

    public Orchid(int quantity, ColorOfFlowers colorOfFlowers) {
        super(quantity, colorOfFlowers);
        setName("orchid");
        if (PriceList.getSetKeys().contains(getName())) {
            setPrice(PriceList.getHashMap().get(getName()));
        }else {
            setPrice(0);
        }
    }
}
