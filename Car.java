public class Car extends Vehicle {
    //Unique field for cars
    private int numPassenger;

    //Constructor
    public Car(String make, String model, int year, int mileage, int numPassenger) {
        super(make, model, year, "Car", mileage);
        this.numPassenger = numPassenger;
    }

    //Override to display car details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Passengers: " + numPassenger);
    }

    //Rental status
    public boolean isRented(String isRented) {
        return isRented.equalsIgnoreCase("Yes");
    }

    //Getter/Setter for numPassengers
    public int getNumPassengers() {return numPassenger;}
    public void setNumPassengers(int numPassengers) { this.numPassenger = numPassengers; }
}
