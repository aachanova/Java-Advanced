import java.util.ArrayDeque;
import java.util.Scanner;

public class L03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (decimal == 0) {
            binary.push(0);
        }

        while (decimal > 0) {
            binary.push(decimal % 2);
            decimal = decimal / 2;
        }

        for (Integer digit : binary) {
            System.out.print(digit);
        }
    }
}
