package com.sdabyd2.programowanie.Flowers;

public abstract class Flowers {

    private String name;
    private int price;
    private int quantity;
    ColorOfFlowers colorOfFlowers;

    public Flowers(int quantity, ColorOfFlowers colorOfFlowers){
        this.quantity = quantity;
        this.colorOfFlowers = colorOfFlowers;
    }

    public String toString(){

        return getName() + ", kolor: " + colorOfFlowers.toString() + ", ilość: "
                + quantity + ", cena: " + getPrice() + "\n";
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ColorOfFlowers getColorOfFlowers() {
        return colorOfFlowers;
    }
}
