package com.company;

import java.util.*;

public class DisplayData {
//changed
    // to create a singleton class for Admin
    private static DisplayData one_Retriever = null;



    // Single Object for MainAdmin
    static DisplayData instantiateOnce() {
        if (one_Retriever == null)
            one_Retriever = new DisplayData();
        return one_Retriever;

    }

    // All restaurants for display
    private Map<String, UserProfile> EndUsers = new HashMap<>();
    private ArrayList<Restaurant> allRestaurants;
    private HashSet<String> allLocations = new HashSet<String>();

    UserProfile createUser(String name, String location) {
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "UserApp"){

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

    UserProfile userLogin() {
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "UserApp") {
            UserApp userApp;
            String username = "";
            UserProfile tempUser = null;
            String usernameCheck = "Pooja";
            String passwordCheck = "pp"; // get existing pw from user
            boolean validUser = false;

            // loop through map and get user object
            tempUser = EndUsers.get(usernameCheck);

            if (tempUser != null) {
                if (tempUser.checkUserPassword(passwordCheck)) {
                    validUser = true;

                }
            }
            if (validUser) {
                userApp = new UserApp();
                userApp.HomePage(tempUser);
            }
        }
    }
    boolean LocationPresent(String location) {
        // Check if the current location is in the Locations HashSet;
        return allLocations.contains(location);

    }

    void setRestaurantsLocations(MainAdmin access, ArrayList<Restaurant> restaurants, HashSet<String> Locations) {
        allRestaurants = restaurants;
        allLocations = Locations;

    }

    ArrayList<Object> showRestaurants(UserProfile user) {
        Map<Restaurant.Food, Integer> itemsSelected = new HashMap<>();
        ArrayList<Object> cartItems = new ArrayList<>();
        Restaurant.Food food;
        Restaurant currentRestaurant;
        int quantity;
        int restaurantId = 0;
        int foodId = 0;

        // Print all restaurant details - name, location
        // if user picks a restaurant:
        currentRestaurant = allRestaurants.get(restaurantId);
        currentRestaurant.showMenu();

        // if user selects food along with quantity
        // added to Map in loop
        food = currentRestaurant.getFood(foodId);
        quantity = -1;
        itemsSelected.put(food, quantity);

        // after user selected foods with quantity, return the food list
        cartItems.add(currentRestaurant);
        cartItems.add(user);
        cartItems.add(itemsSelected);

        return cartItems;
    }

    static void getUsers() {

    }

}