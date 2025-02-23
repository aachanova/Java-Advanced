import java.util.ArrayDeque;
import java.util.Scanner;

public class L05_PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        String input;
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!"print".equals(input = scanner.nextLine())) {
            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(input);
            }
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
