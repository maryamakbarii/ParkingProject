import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ParkingManager parkingManager = new ParkingManager();
        while (true) {
            printMainMenu();
            String mainInput = scanner.nextLine();
            switch (mainInput) {
                case "1":
                    parkingManager.add(scanner);
                    break;
                case "2":
                    parkingManager.remove(scanner);
                    break;
                case "q":
                    return;
                default:
                    out.println("Error! Try Again");
                    break;
            }
        }
    }

    private static void printMainMenu() {
        out.println("*******************");
        out.println("Parking Manager Program");
        out.println("*******************");
        out.println("1. Add Vehicle");
        out.println("2. Remove Vehicle");
        out.println("q. Quite");
        out.print(">>>");
    }
}
