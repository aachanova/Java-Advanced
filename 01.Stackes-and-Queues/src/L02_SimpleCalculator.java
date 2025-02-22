import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class L02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int firstOperand = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondOperand = Integer.parseInt(stack.pop());

            switch (operator) {
                case "+" -> stack.push(String.valueOf(firstOperand + secondOperand));
                case "-" -> stack.push(String.valueOf(firstOperand - secondOperand));
            }
        }

        System.out.println(stack.pop());
    }
}
