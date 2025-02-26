import java.util.ArrayDeque;
import java.util.Scanner;

public class L05_1_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> files = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (!files.isEmpty()) {
                    System.out.printf("Canceled %s%n", files.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                files.offer(input);
            }

            input = scanner.nextLine();
        }

        if (!files.isEmpty()) {
            files.forEach(System.out::println);
        }
    }
}
