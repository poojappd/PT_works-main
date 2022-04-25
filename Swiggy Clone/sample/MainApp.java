/*DP to be assigned at line 50
* user handler and admin handler methods
* Do not directly pass restaurant object to HomePage line 177
* add order Id in restaurantBill class
* create dp in Mainadmin at line 42
* thoughts on method overloading for RestaurantBill generation - userbill resbill?*/
package com.company;

class MainApp {

    public static void main(String[] args) {
        MainAdmin ad = MainAdmin.instantiateOnce();

        String userType = "user";

        UserProfile u1 = createUser("Pooja", "Chennai");
        UserProfile u2 = createUser("Priya", "Chennai");
        UserProfile u3 = createUser("Darshni", "Chennai");
        // r1.prepareOrder(u1,"Tangdi kebab");

        // if existing user, goto Login - both EndUser and admin
        if (userType.equals("admin"))
            ad.checkAdminPassword();
        else
            ;

    }
}
