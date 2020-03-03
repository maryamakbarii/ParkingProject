import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Error! Try Again");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("*******************");
        System.out.println("Parking Manager Program");
        System.out.println("*******************");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Remove Vehicle");
        System.out.println("q. Quite");
        System.out.print(">>>");
    }
}
