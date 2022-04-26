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
        UserApp userEnd = new UserApp();
        String userType = "user";
        //if (userType.equals("admin"))
            ad.AdminApp();
        //else
            userEnd.userApp();

    }
}
