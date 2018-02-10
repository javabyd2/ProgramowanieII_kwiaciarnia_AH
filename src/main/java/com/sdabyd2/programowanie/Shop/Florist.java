package com.sdabyd2.programowanie.Shop;

public class Florist {
    PriceList priceList;

    public Florist() {
        PriceList pl = PriceList.getInstance();
        pl.addToPriceList("rose", 10);
        pl.addToPriceList("lilac", 12);
        pl.addToPriceList("peony", 8);
        pl.addToPriceList("orchid",14);
    }

}
