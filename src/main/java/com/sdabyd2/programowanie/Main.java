package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.Flowers.*;
import com.sdabyd2.programowanie.Shop.Box;
import com.sdabyd2.programowanie.Shop.Florist;
import com.sdabyd2.programowanie.Shop.ShoppingCart;

public class Main {

    public static int valueOf(Box box, ColorOfFlowers color){
        int sum = 0;
        for (int i = 0; i<box.getListOfFlowersInBox().size(); i++) {
            if (box.getListOfFlowersInBox().get(i).getColorOfFlowers().equals(color)){
                sum +=box.getListOfFlowersInBox().get(i).getPrice()*box.getListOfFlowersInBox().get(i).getQuantity();
            }
        }return sum;
    }

    public static void main(String[] args) {

            Florist kwiaciarnia = new Florist();

            Customer janek = new Customer("Janek", 200);

            janek.addToTheShoppingCart(new Rose(5, ColorOfFlowers.RED));
            janek.addToTheShoppingCart(new Peony(5, ColorOfFlowers.RED));
            janek.addToTheShoppingCart(new Fressia(3, ColorOfFlowers.YELLOW));
            janek.addToTheShoppingCart(new Lilac(3, ColorOfFlowers.WHITE));

            ShoppingCart wozekJanka = janek.getShoppingCart();
            System.out.println("Przed płaceniem\n" + wozekJanka);

            janek.pay();

            System.out.println("Po zapłaceniu\n" + janek.getShoppingCart());

            System.out.println("Jankowi zostało : " + janek.getCash() + " zł");

            Box pudelkoJanka = new Box(janek);
            janek.pack(pudelkoJanka);

            System.out.println("Po zapakowaniu do pudełka\n" + janek.getShoppingCart());
            System.out.println(pudelkoJanka);

            System.out.println("Czerwone kwiaty w pudełku Janka kosztowały: " +
            valueOf(pudelkoJanka, ColorOfFlowers.RED) + " zł." );

             Customer stefan = new Customer("Stefan", 60);

            stefan.addToTheShoppingCart(new Lilac(3,ColorOfFlowers.RED));
            stefan.addToTheShoppingCart(new Orchid(1,ColorOfFlowers.WHITE));
            stefan.addToTheShoppingCart(new Rose(5, ColorOfFlowers.YELLOW));

            System.out.println("Wózek przed zapłatą: \n" + stefan.getShoppingCart());
            stefan.pay();
            System.out.println("Wózek po zapłaceniu: \n" + stefan.getShoppingCart());

            Box pudelkoStefana = new Box(stefan);
            stefan.pack(pudelkoStefana);
            System.out.println(pudelkoStefana);
            System.out.println("Stefanowi zostało : " + stefan.getCash() + " zł");
    }
}

