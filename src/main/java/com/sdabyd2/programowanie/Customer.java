package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.Flowers.Flowers;
import com.sdabyd2.programowanie.Shop.Box;
import com.sdabyd2.programowanie.Shop.ShoppingCart;

public class Customer {

    private String customerName;
    private int cash;
    ShoppingCart shoppingCart;


    public Customer(String customerName, int cash){
        this.customerName = customerName;
        this.cash = cash;
        shoppingCart = new ShoppingCart();
        shoppingCart.setOwner(this.customerName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToTheShoppingCart(Flowers flowers){
        shoppingCart.getListOfFlowers().add(flowers);
    }

    public void pay(){
        int cashBalance = getCash() - shoppingCart.sumTheShoppingCart();
        if (cashBalance<0){
            shoppingCart.getListOfFlowers().remove(shoppingCart.getListOfFlowers().size()-1);
            cashBalance = getCash() - shoppingCart.sumTheShoppingCart();
            if (cashBalance>=0){
                setCash(cashBalance);
            }else {
                shoppingCart.getListOfFlowers().remove(shoppingCart.getListOfFlowers().size()-1);
                cashBalance = getCash() - shoppingCart.sumTheShoppingCart();
                setCash(cashBalance);
            }
        }else {
            cashBalance = getCash() - shoppingCart.sumTheShoppingCart();
            setCash(cashBalance);
        }
    }

    public void pack(Box box){
        box.getListOfFlowersInBox().addAll(shoppingCart.getListOfFlowers());
        shoppingCart.getListOfFlowers().clear();
    }
}
