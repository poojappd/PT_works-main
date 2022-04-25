package com.company;

public class UserBill extends RestaurantBill {
    String restaurantName;
    int deliveryCharge;

    int calculateDeliveryCharge(){
        return 2;
    }
}