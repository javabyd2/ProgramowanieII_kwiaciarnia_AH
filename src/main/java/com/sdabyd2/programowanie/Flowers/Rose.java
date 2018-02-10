package com.sdabyd2.programowanie.Flowers;

import com.sdabyd2.programowanie.Shop.PriceList;

public class Rose extends Flowers{

    public Rose(int quantity, ColorOfFlowers colorOfFlowers){
        super(quantity, colorOfFlowers);
        setName("rose");
        if (PriceList.getSetKeys().contains(getName())) {
            setPrice(PriceList.getHashMap().get(getName()));
        }else {
            setPrice(0);
        }
    }

}
