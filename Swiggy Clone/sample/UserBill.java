package com.company;

public class UserBill extends RestaurantBill {
    int deliveryCharge;


    UserBill(String restaurantName, String restaurantLocation,
             String userName, String userLocation, Cart Foods){
        super(restaurantName, restaurantLocation,
                userName,userLocation , Foods.getCartItems());

    }
    int calculateDeliveryCharge(){
        this.deliveryCharge = 2;
        return deliveryCharge;
    }
}