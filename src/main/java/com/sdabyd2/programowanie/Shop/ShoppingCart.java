package com.sdabyd2.programowanie.Shop;

import com.sdabyd2.programowanie.Flowers.Flowers;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private String owner;
    private List<Flowers> listOfFlowers;
    PriceList priceList;

    public ShoppingCart(){
        listOfFlowers = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Flowers> getListOfFlowers() {
        return listOfFlowers;
    }

    public int sumTheShoppingCart(){
        int sum = 0;
        for(int i = 0; i<listOfFlowers.size(); i++){
            if (listOfFlowers.get(i).getPrice()==0) {
                System.out.println("Brak " + listOfFlowers.get(i).getName() + " w cenniku, pozycja została usunięta z koszyka");
                listOfFlowers.remove(i);
                i-=1;
            }
        }
        for (int j = 0; j<listOfFlowers.size(); j++){
            sum += listOfFlowers.get(j).getQuantity()*listOfFlowers.get(j).getPrice();
            }
            return sum;
    }

    public String toString(){
        if (listOfFlowers.isEmpty()){
            return "Wózek: właściciel " + owner + " jest pusty.";
        }else {
            return "Wózek: właściciel " + owner + "\n" + listOfFlowers + "\n";
        }
    }



}
