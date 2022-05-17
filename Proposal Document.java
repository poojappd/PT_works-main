import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
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
    CAB_BOOKING

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
    Vehicle vehicle;
    
}
class CabSystem{
    
}
class User{

    private String firstName;
    private String lastName;
    private int age;
    private String userId;
    private char[]  password;


    public String getFirstName();
    public String getLastName();
    public int getAge();
    public String getUserId();

}
class Customer extends User{
    String userAddress;
    private StationPoint currentStationPoint;
    ArrayList <Fare> bookingHistory;

}

class Database{
    HashMap<String, User> allUsers;
    HashMap <String, char[]> userCredentials;

    private getUser(String userName, char[] password);
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
    VehicleType vehicleType;
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
    public CarModel getCarModel();
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

    void f(){
        System.out.println(maxOccupants);
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

    public void pickupCustomer(Location fromLocation, Location toLocation){

    }

}
