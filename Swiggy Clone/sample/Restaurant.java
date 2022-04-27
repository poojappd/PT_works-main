package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class Restaurant{
    private String RestaurantName;
    private String RestaurantLocation;
    private ArrayList<Food> menu = new ArrayList<>();
    private ArrayList<RestaurantBill> OrderHistory;
    private RestaurantBill restaurantBill;


    //Constructor to create a new Restaurant object
    Restaurant(String name, String location){
        RestaurantName = name;
        RestaurantLocation = location;
    }

        //Inner Class Food
        class Food{
             String name;
             String type;
             int price;
             int preparingTime;

            Food(String food, String type, int price, int preparingTime){
                //food constructor
                name = food;
                this.type = type;
                this.price = price;
                this.preparingTime = preparingTime;
            }
            Food(Food f){
                //food constructor for Food copy
                this.name = f.name;
                this.type = f.type;
                this.price = f.price;
                this.preparingTime = f.preparingTime;
            }


        }

    //Add new foods to menu ArrayList
    void addFoods(String food, String type, int price, int preparingTime){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "com.company.MainAdmin")
            menu.add(new Food(food, type, price, preparingTime));
    }

    //Displays Food objects as Menu
    void showMenu(){
    }

    Food getFood(int foodId){
        //if called only from displayData or UserApp
        return menu.get(foodId);
    }

    String getRestaurantName(){
        return RestaurantName;
    }
    String getRestaurantLocation(){
        return RestaurantLocation;
    }

    void prepareOrder(UserProfile user, HashMap<String, Integer> Foods){//send RestaurantBill
        RestaurantBill newBill = new RestaurantBill();

        OrderHistory.add(newBill);

    };

    void cancelOrder(UserProfile user, Food f){};
    // remove orderHistory/ set status "cancelled"

}
