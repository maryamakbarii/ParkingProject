import java.util.ArrayList;
import java.util.Scanner;

class ParkingManager {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    int lastID = 0;

    int add(Scanner scanner) {
        showAddMenu();
        Vehicle vehicle;

        String input = scanner.nextLine();
        switch (input) {
            case "1":
                vehicle = new Car(++lastID);
                break;
            case "2":
                vehicle = new Bike(++lastID);
                break;
            default:
                System.out.println("Error! Try Again.");
                return 0;
        }
        System.out.println("Please,Enter EntryHour :");
        input = scanner.nextLine();
        int entryHour = 0;
        try {
            entryHour = Integer.parseInt(input);
        } catch (NumberFormatException n) {
            System.out.println("Error!Try Again.");
        }
        if (entryHour < 0 || entryHour > 23) {
            System.out.println("Error!Try Again.");
        }
        System.out.println("ID: " + lastID);


        vehicle.setEntryHour(entryHour);
        vehicles.add(vehicle);
        return lastID;
    }

    void remove(Scanner scanner) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("Parking Is Empty!");
            return;
        }
        System.out.println("Please,Enter ID :");
        String userInput = scanner.nextLine();
        int id = Integer.parseInt(userInput);

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getId() == id) {
                System.out.println("Please!Enter ExitHour :");
                userInput = scanner.nextLine();
                int exitHourInp = Integer.parseInt(userInput);
                if (exitHourInp < 0 || exitHourInp > 23) {
                    System.out.println("Please Enter Hour Between 0 , 23");
                }
                vehicle.setExitHour(exitHourInp);
                printBill(vehicle);
                vehicles.remove(i);
            }
        }

    }


    private void showAddMenu() {
        System.out.println("****************");
        System.out.println(" Add Vehicle");
        System.out.println("****************");
        System.out.println("1. Add Car");
        System.out.println("2. Add Bike");
        System.out.print(">>>");
    }

    private void printBill(Vehicle vehicle) {
        System.out.println("----------------------");
        System.out.println("         BILL");
        System.out.println("----------------------");
        System.out.println("EntryHour : " + vehicle.getEntryHour());
        System.out.println("ExitHour : " + vehicle.getExitHour());
        System.out.println("Total Price : " + vehicle.getCost());
    }

}
