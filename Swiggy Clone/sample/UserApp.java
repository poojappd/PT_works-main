package com.company;

import java.util.ArrayList;

public class UserApp {
    private DisplayData display = DisplayData.instantiateOnce();
    private UserProfile user;

    private UserProfile login(){
        String userName = "";
        String passwprd = "";

        user = display.createUser(name, location);
    }
    void userApp(){
        //if existing user:
        user = login();

        //if new user
        String name = "";
        String location = "";

        if(name.isEmpty()){
            System.out.println("Name cannot be empty");
        }
        else if(location.isEmpty()){
            System.out.println("Enter a valid location");
        }
        else
            user = display.createUser(name, location);
            
        

        if(!user.isEmpty)
            HomePage(user);


    }

    private void HomePage(UserProfile user) {
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