package com.company;

import java.util.ArrayList;

public class UserApp {
    DisplayData display = DisplayData.instantiateOnce();
    void login(){

    }
    void userApp(){
        //if new user:


    }

    void HomePage(UserProfile user) {
        ArrayList<Object> cartItems;
        cartItems = display.showRestaurants(user);

        if (!cartItems.isEmpty()) {
            user.addToCart(cartItems);
            // if user selects book order
            BookingPage(user);
            // else if user empties cart:
            user.removeFromCart();

        }
    }

    void BookingPage(UserProfile user) {

    }

}