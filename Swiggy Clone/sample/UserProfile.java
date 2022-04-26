package com.company;

import java.util.ArrayList;
import java.util.Map;

public class UserProfile {
    private String userid;
    private String username;
    private char[] password;
    private String userLocation;
    private ArrayList<UserBill> myOrders;
    private Cart myCart;

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

    boolean checkUserPassword(String somePassword){
        if(somePassword.equals(password))
            return true;
        return false;
    }

    // add new Orders to orderHistory - myOrders
    void addToOrders() {

    }

    void addToCart(Cart cart) {
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "com.company.UserApp") {
            myCart = cart;
        }
    }
    Cart modifyCart(){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "com.company.UserApp") {
            return myCart;
        }
        return null;
    }

    void removeFromCart() {
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "com.company.UserApp") {
            myCart.emptyCart();
        }
    }

}
