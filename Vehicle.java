public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String vehicleType;
    private int mileage;

    //Constructor
    public Vehicle(String make, String model, int year, String vehicleType, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleType = vehicleType;
        this.mileage = mileage;
    }

    //Display method for vehicle details
    public void displayDetails() {
        System.out.println("Type: " + vehicleType);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }

    //Getters and Setters
    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public String getVehicleType() {return vehicleType;}
    public void setVehicleType(String vehicleType) {this.vehicleType = vehicleType;}

    public int getMileage() {return mileage;}
    public void setMileage(int mileage) {this.mileage = mileage;}
    
}
