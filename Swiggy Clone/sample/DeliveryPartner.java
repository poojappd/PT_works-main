package com.company;

import java.util.ArrayList;


public class DeliveryPartner {
    private String name;
    private int age;
    private String currentLocation;
    private ArrayList<String> AvailableLocations;
    boolean engaged;

    DeliveryPartner(String name, int age){

    }

    void addAvailableLocations(String location){
        AvailableLocations.add(location);
    }

    String getCurrentLocation(){
        return currentLocation;
    }
    ArrayList<String> getAvailableLocations(){
        return new ArrayList<>(AvailableLocations);
    }

    void pickupFood(Restaurant res){};
    void deliverFood(String userName, String userLocation){}

    //if COD then return money to the restaurant
    void CodReturn(){}
}