package com.company;

import java.util.*;

public class DisplayData {
//changed
    // to create a singleton class for Admin
    private static DisplayData one_Retriever = null;

    // Single Object for Display Data
    static DisplayData instantiateOnce() {
        if (one_Retriever == null)
            one_Retriever = new DisplayData();
        return one_Retriever;
    }

    // All restaurants for display
    private Map<String, UserProfile> EndUsers = new HashMap<>();
    private ArrayList<Restaurant> allRestaurants;
    private ArrayList<String> allLocations = new ArrayList<>();

    UserProfile createUser(String name, String location) {
        String callerClassName = new Exception().getStackTrace()[1].getClassName();
        //System.out.println(callerClassName);
        if(callerClassName == "com.company.UserApp"){

            // get all details from user
            String userid = UUID.randomUUID().toString();
            EncryptDecrypt ed = new EncryptDecrypt();
            String password = "pp"; // get from user
            UserProfile newUser = new UserProfile(userid, name, location, ed.encrypt(password));
            EndUsers.put(newUser.getUsername(), newUser);

            return newUser;
        }
        return null;
    }

    UserProfile userLogin(String usernameCheck, String passwordCheck) {

            UserProfile tempUser = null;

            // loop through map and get user object
            tempUser = EndUsers.get(usernameCheck);

            if (tempUser != null) {
                if (tempUser.checkUserPassword(passwordCheck)) {
                    return tempUser;
                }
            }

            System.out.println("Invalid username or password");

            return null;
        }
    boolean LocationPresent(String location) {
        // Check if the current location is in the Locations HashSet;
        if(allLocations.isEmpty())
            return true;

        return allLocations.contains(location);

    }
    void addLocation(String location){
        allLocations.add(location);
    }

    void setRestaurants(MainAdmin access, ArrayList<Restaurant> restaurants) {
        allRestaurants = restaurants;

    }

    int showRestaurants() {
        Restaurant currentRestaurant;
        int restaurantId = 0; //entered by user after showRestaurant

        // Print all restaurant details - name, location with id
        for (int i = 0; i < allRestaurants.size(); i++) {

            Restaurant displayCurrentRestaurant = allRestaurants.get(i);
            System.out.println(displayCurrentRestaurant.getRestaurantName()
                    + " " + displayCurrentRestaurant.getRestaurantLocation());
        }
        // if user picks a restaurant:
        currentRestaurant = allRestaurants.get(restaurantId);
        currentRestaurant.showMenu();
        return restaurantId;
    }
    String fetchFoodItem(int restaurantId, int foodId){


        Restaurant currentRestaurant = allRestaurants.get(restaurantId);
        Restaurant.Food food;
        return currentRestaurant.getFood(foodId).name;


    }
    String getRestaurantName(int restaurantId){
        return allRestaurants.get(restaurantId).getRestaurantName();
    }
    String getRestaurantLocation(int restaurantId){
        return allRestaurants.get(restaurantId).getRestaurantLocation();
    }

    //to contact restaurant for order
    Restaurant getRestaurant(int restaurantId){
        //called only by userApp
        return allRestaurants.get(restaurantId);
    }




}