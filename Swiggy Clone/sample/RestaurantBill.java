package com.company;

import java.util.HashMap;

public class RestaurantBill {
    private String userName;
    private String userLocation;
    private String restaurantName;
    private String restaurantLocation;
    private HashMap<String, Integer> Items;

    RestaurantBill(){}

    RestaurantBill (String restaurantName, String restaurantLocation,
                    String userName, String userLocation, HashMap<String, Integer> FoodItems){
        int orderId;
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.userName = userName;
        this.userLocation = userLocation;
        this.Items = FoodItems;

    }
    void showBill(){
        //print all attributes with price details;
        calculateBill();
    }

    int calculateBill(){
        //return amount of bill
        return 1;
    }
}