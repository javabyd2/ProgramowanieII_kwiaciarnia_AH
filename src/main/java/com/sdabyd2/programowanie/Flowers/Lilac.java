package com.sdabyd2.programowanie.Flowers;

import com.sdabyd2.programowanie.Shop.PriceList;

public class Lilac extends Flowers {

    public Lilac(int quantity, ColorOfFlowers colorOfFlowers) {
        super(quantity, colorOfFlowers);
        setName("lilac");
        if (PriceList.getSetKeys().contains(getName())) {
            setPrice(PriceList.getHashMap().get(getName()));
        }else {
            setPrice(0);
        }
    }

}
