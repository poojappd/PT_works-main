package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserApp {

    private DisplayData display = DisplayData.instantiateOnce();
    private UserProfile user;

    //Restaurant selectedRestaurant;
    int restaurantId;

    private UserProfile login(){
        String userName = "Pooja";
        String password = "pp";

        return display.userLogin(userName, password);
    }

    void userApp(){
        //if existing user:
        user = login();
        if(user == null)
        {//if new user
            String name = "Pooja";
            String location = "chennai";

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty");
            } else if (location.isEmpty()) {
                System.out.println("Enter a valid location");
            } else
                user = display.createUser(name, location);
            System.out.println(user);

        }
        if(user != null)
            HomePage();
    }

    private void HomePage() {
        Cart cartItems;
        int RestaurantId = display.showRestaurants();

        if (RestaurantId!=-1) {
            cartItems = TakeOrder(RestaurantId);
            if (cartItems != null) {
                user.addToCart(cartItems);
                // if user want to view cart
                viewCart(cartItems);
                // else if user empties cart:
                //user.removeFromCart();

            }
        }
    }

    private Cart TakeOrder(int restaurantId){

        HashMap<String, Integer> itemsSelected = new HashMap<>();

        // if user selects food along with quantity
        // added to array in loop

        //loop begins
        int foodId = 0; //get from user
        int quantity = -1;

        //storing the copy of food object and its quantity in Object array
        String foodName= display.fetchFoodItem(restaurantId, foodId);
        //Object[] tempArr= {food, quantity};

        //storing the food name and object array in hashmap
        itemsSelected.put(foodName, quantity);
        //loop ends


        // after user selected foods with quantity, return the food list
        Cart userCart = new Cart(itemsSelected,
                display.getRestaurantName(restaurantId),
                display.getRestaurantLocation(restaurantId));
        this.restaurantId = restaurantId;
        return userCart;
    }

    private float calculateTotalPrice(Cart cart){
        float price = 0;
        //iterate through food and its quantity and return price
        return price;
    }

    private void viewCart(Cart cartItems){
        //display cart items

        //if user make changes to cart
        user.modifyCart();

        ////show cart items with price
        calculateTotalPrice(cartItems);

        //if user wants to make an order with the cartItems,
        BookingPage(cartItems);
    }

    private void BookingPage(Cart cartItems) {

        //if user confirms payment mode
        String restaurantName = cartItems.getCartRestaurant();
        String restaurantLocation= cartItems.getRestaurantLocation();
        String username = user.getUsername();
        String userLocation = user.getUserLocation();

        UserBill bill = new UserBill(restaurantName, restaurantLocation,
                username, userLocation, cartItems);

        Restaurant res = display.getRestaurant(restaurantId);
        res.prepareOrder(user, cartItems.getCartItems());
    }

}