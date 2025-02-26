import java.util.ArrayDeque;
import java.util.Scanner;

public class L08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();
        String input = "";
        while (!"Home".equals(input = scanner.nextLine())) {
            if (!input.equals("back") && !input.equals("forward")) {
                browserHistory.push(input);
                forwardHistory.clear();
                System.out.println(browserHistory.peek());
            } else if (input.equals("back")){
                if (browserHistory.size() > 1) {
                    forwardHistory.push(browserHistory.pop());
                    System.out.println(browserHistory.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                if (forwardHistory.size() > 0) {
                    System.out.println(forwardHistory.peek());
                    browserHistory.push(forwardHistory.pop());
                } else {
                    System.out.println("no next URLs");
                }
            }
        }
    }
}
