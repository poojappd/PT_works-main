package com.company;

import java.util.*;

 class MainAdmin {

    private final ArrayList<Restaurant> Restaurants = new ArrayList<>();
    private ArrayList<DeliveryPartner> DeliveryPartners = new ArrayList<>();
    private Restaurant restaurant;
    private DeliveryPartner deliveryPartner;
    private EncryptDecrypt ed = new EncryptDecrypt();
    private static DisplayData display = DisplayData.instantiateOnce();
    private char[] adminPassword = ed.encrypt("Admin@123");


    // Scanner sc = new Scanner(System.in);

    // to create a singleton class for Admin
    private static MainAdmin one_Admin = null;

    // Single Object for MainAdmin
    static MainAdmin instantiateOnce() {
        if (one_Admin == null) {
            one_Admin = new MainAdmin();
        }

        return one_Admin;
    }


    private Restaurant createRestaurant(String name, String location) {
        if (!display.LocationPresent(location)) {
            display.addLocation(location);
        }
        restaurant = new Restaurant(name, location);
        Restaurants.add(restaurant);
        return restaurant;
    }

    private DeliveryPartner createDeliveryPartner(String name, int age){
        deliveryPartner = new DeliveryPartner(name, age);
        DeliveryPartners.add(deliveryPartner);
        return deliveryPartner;


    }


    private boolean checkAdminPassword(){
        String somePassword = "Admin@123";
        if (Arrays.equals(somePassword.toCharArray(), adminPassword))
            return true;
        return false;
    }

    private void addFoodToRestaurant(){
        //get restaurant from arraylist
        // and add new food items to menu
    }

     void AdminApp() {
        if(checkAdminPassword()) {
            // get admin input in loop until exit

            String adminCall = "";

            // get name, location as input and pass;

            Restaurant r1 = createRestaurant("Coal BBQ", "Pallavaram");
            // r2 = ad.createRestaurant("Domino's Pizza","Chengalpet");

            // adding food to menu until admin stops giving input
            r1.addFoods("Tangdi Kebab", "Starters", 190, 25);
            r1.addFoods("Chicken Tikka", "Starters", 225, 20);
            r1.addFoods("Chocolate Truffle", "Dessert", 84, 10);
            r1.addFoods("Mini Burger Combo", "Burger", 200, 25);

            DeliveryPartner dp1 = createDeliveryPartner("Ramesh", 31);
            dp1.addAvailableLocations("Pallavaram");
            dp1.addAvailableLocations("Pammal");
            dp1.addAvailableLocations("Chromepet");

            DeliveryPartner dp2 = createDeliveryPartner("Suresh", 30);
            dp1.addAvailableLocations("Tambaram");
            dp1.addAvailableLocations("Medavakkam");
            dp1.addAvailableLocations("Chromepet");


            // r.addFoods(food, type, price, preparingTime);
            display.fetchData(this, Restaurants, DeliveryPartners);
        }
        else{
            System.out.println("Invalid Admin Password !!!!!!");
        }
    }
    void assignDeliveryPartner(UserProfile user, String RestaurantName,
                               String RestaurantLocation){
        String callerClassName = new Exception().getStackTrace()[1].getClassName();

        if(callerClassName == "com.company.UserApp") {
            //find nearest DP and send pickup order.
        }


    }

}
