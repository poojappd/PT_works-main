package com.company;

import java.util.*;

public class MainAdmin {

    private ArrayList<Restaurant> Restaurants = new ArrayList<>();
    static int restaurantId = 0; // for new restaurants
    private Restaurant restaurant;
    private UserProfile user;
    private EncryptDecrypt ed = new EncryptDecrypt();
    private DisplayData dd = DisplayData.instantiateOnce();
    private char[] adminPassword = ed.encrypt("Admin@123");
    private HashSet<String> Locations = new HashSet<String>();
    // Scanner sc = new Scanner(System.in);

    // to create a singleton class for Admin
    private static MainAdmin one_Admin = null;

    // Single Object for MainAdmin
    static MainAdmin instantiateOnce() {
        if (one_Admin == null)
            one_Admin = new MainAdmin();
        return one_Admin;
    }



    private Restaurant createRestaurant(String name, String location) {
        if (!dd.LocationPresent(location)) {
            addLocation(location);
        }
        restaurant = (new Restaurant(name, location));
        Restaurants.add(restaurant);

        return restaurant;
    }

     void addLocation( String location) {
        // Prompt the user for nearest locations and add the new location between them;
        Locations.add(location);
    }
    boolean checkAdminPassword(){
        String somePassword = "Admin@123";
        if (Arrays.equals(somePassword.toCharArray(), adminPassword))
            return true;
        return false;
    }


    private void AdminApp() {

        // get admin input in loop until exit

        String choice = "c";

        // get name, location as input and pass;

        Restaurant r1 = createRestaurant("Coal BBQ", "Chennai");
        // r2 = ad.createRestaurant("Domino's Pizza","Chengalpet");

        // adding food to menu until admin stops giving input
        r1.addFoods("Tangdi Kebab", "Starters", 190, 25);
        r1.addFoods("Chicken Tikka", "Starters", 225, 20);
        r1.addFoods("Chocolate Truffle", "Dessert", 84, 10);
        r1.addFoods("Mini Burger Combo", "Burger", 200, 25);

        // r.addFoods(food, type, price, preparingTime);
        dd.setRestaurantsLocations(this, new ArrayList(Restaurants), new HashSet<>(Locations));

    }
}
