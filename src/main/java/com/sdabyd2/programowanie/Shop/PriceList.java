package com.sdabyd2.programowanie.Shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PriceList {

    private static PriceList instance = null;
    private static Map<String, Integer> hashMap;
    private static Set<String> setKeys;

    public static PriceList getInstance() {
        if (instance == null) {
            instance = new PriceList();
            hashMap = new HashMap<>();
            setKeys = hashMap.keySet();
        }
        return instance;
    }

    public static Map<String, Integer> getHashMap() {
        return hashMap;
    }

    public void addToPriceList(String nameOfFlower, Integer price){
        hashMap.put(nameOfFlower,price);
    }
    public void removeFromPriceList(String nameOfFlower){
        hashMap.remove(nameOfFlower);
    }

    public static Set<String> getSetKeys() {
        return setKeys;
    }
}
