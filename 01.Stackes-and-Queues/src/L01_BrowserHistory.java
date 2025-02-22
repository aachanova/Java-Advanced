import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class L01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input;
        String currentURL = null;

        while (!"Home".equals(input = scanner.nextLine())) {
            if (input.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    continue;
                } else {
                    currentURL = browserHistory.pop();
                }
            } else {
                if (currentURL != null) {
                    browserHistory.push(currentURL);
                }
                currentURL = input;
            }
            System.out.println(currentURL);
        }
    }
}
