package com.company;

import java.util.ArrayList;
import java.util.Map;

public class UserProfile {
    private String userid;
    private String username;
    private char[] password;
    private String userLocation;
    private ArrayList<UserBill> myOrders;
    private ArrayList<Object> myCart;

    UserProfile(String id, String name, String location, char[] password) {
        userid = id;
        username = name;
        userLocation = location;
        this.password = password;
    }


    String getUsername() {
        return username;
    }

    String getUserLocation() {
        return userLocation;
    }



    // add new Orders to orderHistory - myOrders
    void addToOrders() {
    }

    void addToCart(ArrayList<Object> cart) {
        myCart = cart;
    }

    void removeFromCart() {
        myCart.clear();
    }

}
