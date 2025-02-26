import java.util.ArrayDeque;
import java.util.Scanner;

public class L04_MatchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> indexesOfOpeningBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                indexesOfOpeningBrackets.push(i);
            } else if (input.charAt(i) == ')') {
                System.out.println(input.substring(indexesOfOpeningBrackets.pop(), i + 1));
            }
        }
    }
}
