package com.company;

import java.util.ArrayList;


public class Restaurant{
    private String RestaurantName;
    private String RestaurantLocation;
    private String[] RestaurantDetails;
    private ArrayList<Food> menu = new ArrayList<>();
    private ArrayList<RestaurantBill> OrderHistory;
    private RestaurantBill restaurantBill;


    //Constructor to create a new Restaurant object
    private Restaurant(String name, String location){
        RestaurantName = name;
        RestaurantLocation = location;
        RestaurantDetails  = new String[]{RestaurantName, RestaurantLocation};
    }

    //access Restaurant Constructor only if it's called from Admin
    Restaurant createRestaurant(String name, String location){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();
        if(callerClassName == "MainAdmin")
            return new Restaurant(String name, String location);
        return null;
    }

        class Food{
             String name;
             String type;
             int price;
             int preparingTime;

            Food(String food, String type, int price, int preparingTime){
                //food constructor for instantiatio
                name = food;
                this.type = type;
                this.price = price;
                this.preparingTime = preparingTime;
            }

        }

    //Add new foods to menu ArrayList
    void addFoods(String food, String type, int price, int preparingTime){
        menu.add(new Food(food, type, price, preparingTime));
    }

    //Displays Food objects as Menu
    void showMenu(){
    }

    Food getFood(int foodId){
        return menu.get(foodId);
    }

    String getRestaurantName(){
        return RestaurantName;
    }
    String getRestaurantLocation(){return RestaurantLocation;}

    void prepareOrder(UserProfile user, String food){//send RestaurantBill
        // OrderHistory.add(restaurantBill.calculateBill(food,this, user));
    };

    void cancelOrder(UserProfile user, Food f){};// remove orderHistory/ set status "cancelled"

}
