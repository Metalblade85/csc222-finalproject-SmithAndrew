public class Truck extends Vehicle {
    //Unique field for truck
    private int payload;

    //Constructor
    public Truck(String make, String model, int year, int mileage, int payload) {
        super(make, model, year, "Truck", mileage);
        this.payload = payload;
    }

    //Override to display truck details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload: " + payload + " lbs");
    }

    //Rental status
    public boolean isRented(String isRented) {
        return isRented.equalsIgnoreCase("Yes");
    }

    //Getter/Setter for payload
    public int getPayload() {return payload;}
    public void setPayload(int payload) { this.payload = payload; }

    //Override for exportToCSV
    @Override
    public String toCSV() {
        return super.toCSV() + "," + getPayload();
    }
}
