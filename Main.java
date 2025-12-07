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
    }
}