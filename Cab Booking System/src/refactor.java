import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
enum StationPoint {
    PALLAVARAM,
    TAMBARAM,
    CHROMEPET,
}

enum CabBookingStatus{
    SUCCESS,
    CANCELLED
}

enum CabServiceType{
    RENTAL,
    CARPOOL,
    CAB_BOOKING,
    SCHEDULE_BOOKING

}

enum VehicleType {
    CAR,
    AUTO_RICKSHAW,
    BIKE
}

enum CarType{
    PRIME,
    SEDAN,
    SUV

}

class CabSearchSystem{
    ArrayList<Vehicle> allNearbyVehicles;


}

class CabSystem{

}

class User{

    private String firstName;
    private String lastName;
    private int age;
    private String userId;
    private char[]  password;


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getUserId(){
        return userId;
    }

    class Customer extends User{
        String userAddress;
        private StationPoint currentStationPoint;
        ArrayList <Fare> bookingHistory;

        public String getUserAddress(){
            return userAddress;
        }

        public StationPoint getCurrentStationPoint() {
            return currentStationPoint;
        }

        ArrayList<Fare> getBookingHistory() {
            return bookingHistory;
        }

    }
}

class Database{
    HashMap<String, User> allUsers;
    HashMap <String, char[]> userCredentials;

    private getUser(String userName);
    public verifyUser(String userName, char[] password);



}
class Location{
    private int xCoordinate;
    private int yCoordinate;
    private StationPoint stationPoint;

    public int getxCoordinate();
    public int getyCoordinate();
    public StationPoint getStationPoint();

}
class Vehicle{
    private String vehicleId;
    private String vehicleName;
    private VehicleType vehicleType;
    private int mileage;
    private int numberOfWheels;
    private String ownerName;
    private int fuelLevel;
    private String plateNumber;
    private int maxOccupants;

    public String getVehicleId();
    public String getVehicleName();
    public String getOwnerName();
    public String getPlateNumber();
    public int getNumberOfWheels();
    public int getMileage();
    public int getFuelLevel();

}

class Car extends Vehicle{
    private CarType carType;
    private boolean airConditionerPresent;
    private boolean wifiPresent;

    float addConvenienceFee();
    public CarType getCarType();
}
class Fare{
    private String CustomerName;
    private String driverName;
    private LocalDateTime cabBookedTime;
    private LocalDateTime cabReachedTime;
    private Location fromLocation;
    private Location toLocation;
    private CabBookingStatus cabBookingStatus;


    public String getCustomerName();
    public String getDriverName();
    public LocalDateTime getCabBookedTime();
    public LocalDateTime getCabReachedTime();
    public Location getFromLocation();
    public Location getToLocation();
    public CabBookingStatus getCabBookingStatus();
}
class FareCalculator{

}
class Bike extends Vehicle{
    private final int maxOccupants = 1;
    private final float timeDurationReductionRate = 0.15f;
    private final float BikeRate = 0.25f;

    public int getMaxOccupants() {
        return maxOccupants;
    }

    public float getTimeDurationReductionRate() {
        return timeDurationReductionRate;
    }

    public float getBikeRate() {
        return BikeRate;
    }
}
class AutoRickshaw extends Vehicle{

}

class Driver extends User{
    private String driverId;
    private int fareLimitPerDay;
    private boolean reachedFareLimit;
    private int currentFareCount;
    private Vehicle vehicleOwned;
    StationPoint defaultStationPoint;
    StationPoint currentStationPoint;

    public String getDriverId() {
        return driverId;
    }
    //in constructor
    public void setFareLimitPerDay(int fareLimitPerDay) {
        this.fareLimitPerDay = fareLimitPerDay;
    }

    public int getFareLimitPerDay() {
        return fareLimitPerDay;
    }

    public void setReachedFareLimit(boolean reachedFareLimit) {
        this.reachedFareLimit = reachedFareLimit;
    }

    public boolean hasReachedFareLimit() {
        return reachedFareLimit;
    }

    public void setCurrentFareCount(int currentFareCount) {
        this.currentFareCount = currentFareCount;
    }

    public int getCurrentFareCount() {
        return currentFareCount;
    }

    public void viewVehicleOwned(){
        System.out.println("Vehicle Owner: "+vehicleOwned.getOwnerName()+
                "\n"+  vehicleOwned.getVehicleName()+"\n" +
                vehicleOwned.getPlateNumber()   );
    }

    public void pickupCustomer(Location fromLocation, Location toLocation){

    }

}

class RentalService{

}
class CabBookingSystemApp{
    User currentAppUser;

}