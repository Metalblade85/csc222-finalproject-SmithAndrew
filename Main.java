import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Vehicle> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Menu
        String choice;
        do {
            printHeader();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addItem();
                    break;
                case "2":
                    listItems();
                    break;
                case "3":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option. Try again");
            }
        }while (!choice.equals("3"));

        scanner.close();

    }//printHeader menu
    private static void printHeader() {
        System.out.println("\nBlue Ridge Car Rental system");
        System.out.println("1) Add a Vehicle");
        System.out.println("2) List Inventory");
        System.out.println("3) Exit");
        System.out.print("Enter choice: ");
    }

    //Adding a vehicle
    private static void addItem() {
        System.out.println("\nAdd new vehicle");
        System.out.println("Adding a Car or Truck? (Type C or T): ");
        String type = scanner.nextLine().trim().toUpperCase();

        System.out.println("Enter Make: ");
        String make =scanner.nextLine();

        System.out.println("Enter Model: ");
        String model =scanner.nextLine();

        System.out.println("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Mileage: ");
        int mileage = Integer.parseInt(scanner.nextLine());

        //Car or Truck logic
        if (type.equals("C")) {
            System.out.println("Enter maximum passengers: ");
            int passengers = Integer.parseInt(scanner.nextLine());

            //Create car object and add to list
            Car newCar = new Car(make, model, year, mileage, passengers);
            inventory.add(newCar);
            System.out.println(">> Car added successfully!");

        } else if (type.equals("T")) {
            System.out.print("Enter payload capacity (lbs): ");
            int payload = Integer.parseInt(scanner.nextLine());

            //Create truck object and add to list
            Truck newTruck = new Truck(make, model, year, mileage, payload);
            inventory.add(newTruck);
            System.out.println(">> Truck added successfully!");

        } else {
            System.out.println("Invalid selection");
        }//Ends Car or Truck else/if

    }//Ends addItem

    private static void listItems() {
        System.out.println("\n Inventory");

        if (inventory.isEmpty()) {
            System.out.println("No inventory");
        } else {
            for (Vehicle v : inventory) {
                v.displayDetails();
                System.out.println("---");
            }
        }
    }//Ends listItems
}