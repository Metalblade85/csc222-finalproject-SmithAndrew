public class Main {
    public static void main(String[] args) {
        //Make Car object
        Car sedan= new Car("Toyota", "Corolla", 2022, 15000, 5);

        //Make Truck Object
        Truck pickup = new Truck("Chevrolet", "Silverado", 2020, 30000, 2000);

        //Print test
        System.out.println("Car rental test:");
        sedan.displayDetails();
        pickup.displayDetails();

    }
}