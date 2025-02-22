import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class L01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (!input.equals("back")) {
                browserHistory.push(input);
            } else {
                if (browserHistory.size() > 1) {
                    browserHistory.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            }

            System.out.println(browserHistory.peek());
            input = scanner.nextLine();
        }
    }
}
