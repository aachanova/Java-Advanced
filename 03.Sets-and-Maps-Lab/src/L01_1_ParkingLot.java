import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L01_1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parkLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] carInfo = input.split("\\, ");
            String direction = carInfo[0];
            String carNumber = carInfo[1];

            switch (direction) {
                case "IN" -> parkLot.add(carNumber);
                case "OUT" -> parkLot.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        parkLot.forEach(System.out::println);

        if (parkLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
    }
}
