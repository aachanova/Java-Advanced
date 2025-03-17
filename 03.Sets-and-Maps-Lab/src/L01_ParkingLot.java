import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class L01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingLot = new LinkedHashSet<>();
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            String[] inputData = input.split(", ");
            if (inputData[0].equals("IN")) {
                parkingLot.add(inputData[1]);
            } else {
                parkingLot.remove(inputData[1]);
            }
        }
        System.out.print(parkingLot.isEmpty()
                ? "Parking Lot is Empty"
                : parkingLot.stream().collect(Collectors.joining(System.lineSeparator())));
    }
}
