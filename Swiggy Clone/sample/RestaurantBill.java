package com.company;

import java.util.ArrayList;

public class RestaurantBill {
    private String userName;
    private String userLocation;
    private String restaurantName;
    private String restaurantLocation;
    private String food;
    private int quantity;

    RestaurantBill(){}

    RestaurantBill (ArrayList<Object> cartItems){
        Restaurant chosenRestaurant = (Restaurant) cartItems.get(0);
        UserProfile currentUser = (UserProfile) cartItems.get(1);

        restaurantName = chosenRestaurant.getRestaurantName();
        restaurantLocation = chosenRestaurant.getRestaurantLocation();
        userName = currentUser.getUsername();
        userLocation = currentUser.getUserLocation();

    }

    int calculateBill(){
        //return amount of bill
        return 1;
    }
}