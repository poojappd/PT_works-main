package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private HashMap <String, Integer> items;
    private String restaurantName;
    private String restaurantLocation;

    Cart(HashMap <String, Integer> items, String restaurantName, String restaurantLocation){
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.items = items;
    }

    String getCartRestaurant(){
        return restaurantName;
    }
    String getRestaurantLocation(){
        return restaurantLocation;
    }
    HashMap <String, Integer> getCartItems(){
        return new HashMap<>(items);
    }
    void emptyCart(){
        this.restaurantLocation = null;
        this.restaurantName =null;
        this.items.clear();
    }


}
