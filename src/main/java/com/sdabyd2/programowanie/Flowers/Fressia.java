package com.sdabyd2.programowanie.Flowers;

import com.sdabyd2.programowanie.Shop.PriceList;

public class Fressia extends Flowers {

    public Fressia(int quantity, ColorOfFlowers colorOfFlowers) {
        super(quantity, colorOfFlowers);
        setName("fressia");
        if (PriceList.getSetKeys().contains(getName())) {
            setPrice(PriceList.getHashMap().get(getName()));
        }else {
            setPrice(0);
        }
    }
}
