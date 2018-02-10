package com.sdabyd2.programowanie.Shop;

import com.sdabyd2.programowanie.Customer;
import com.sdabyd2.programowanie.Flowers.Flowers;

import java.util.ArrayList;
import java.util.List;

public class Box {
    Customer customer;
    private List<Flowers> listOfFlowersInBox;

    public Box(Customer customer){
        this.customer = customer;
        listOfFlowersInBox = new ArrayList<>();
    }

    public List<Flowers> getListOfFlowersInBox() {
        return listOfFlowersInBox;
    }

    @Override
    public String toString() {
        if (listOfFlowersInBox.isEmpty()){
            return "Pudełko: właściciel " + customer.getCustomerName() + " jest pusty.";
        }else {
            return "Pudełko: właściciel " + customer.getCustomerName() + "\n" + listOfFlowersInBox + "\n";
        }
    }
}
