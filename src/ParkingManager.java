import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;
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
                out.println("Error! Try Again.");
                return 0;
        }
        out.println("Please,Enter EntryHour :");
        input = scanner.nextLine();
        int entryHour = 0;
        try {
            entryHour = Integer.parseInt(input);
        } catch (NumberFormatException n) {
            out.println("Error!Try Again.");

        }
        if (entryHour < 0 || entryHour > 23) {
            out.println("Error!Try Again.");
        } else {
            out.println("ID: " + lastID);


            vehicle.setEntryHour(entryHour);
            vehicles.add(vehicle);
            return lastID;
        }
        return 0;
    }

    void remove(Scanner scanner) {
        if (vehicles == null || vehicles.isEmpty()) {
            out.println("Parking Is Empty!");
            return;
        }
        out.println("Please,Enter ID :");
        String userInput = scanner.nextLine();
        int id = Integer.parseInt(userInput);

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getId() == id) {
                out.println("Please!Enter ExitHour :");
                userInput = scanner.nextLine();
                int exitHourInp = Integer.parseInt(userInput);
                if (exitHourInp < 0 || exitHourInp > 23) {
                    out.println("Please Enter Hour Between 0 , 23");
                }
                vehicle.setExitHour(exitHourInp);
                printBill(vehicle);
                vehicles.remove(i);
            }
        }//

    }


    private void showAddMenu() {
        out.println("****************");
        out.println(" Add Vehicle");
        out.println("****************");
        out.println("1. Add Car");
        out.println("2. Add Bike");
        out.print(">>>");
    }

    private void printBill(Vehicle vehicle) {
        out.println("----------------------");
        out.println("         BILL");
        out.println("----------------------");
        out.println("EntryHour : " + vehicle.getEntryHour());
        out.println("ExitHour : " + vehicle.getExitHour());
        out.println("Total Price : " + vehicle.getCost());
    }

}
