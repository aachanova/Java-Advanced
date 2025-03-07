import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05_1_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        ArrayDeque<Character> closeBracketsQueue = new ArrayDeque<>();

        char[] input = scanner.nextLine().toCharArray();
        boolean areBalanced = true;

        for (char current : input) {
            switch (current) {
                case '{', '[', '(' -> openBracketsStack.push(current);
                case '}', ']', ')' -> closeBracketsQueue.offer(current);
            }

            while (!openBracketsStack.isEmpty() && !closeBracketsQueue.isEmpty()) {
                char lastInStack = openBracketsStack.pop();
                char firstInQueue = closeBracketsQueue.poll();
                if (lastInStack == '{') {
                    if (firstInQueue != '}') {
                        areBalanced= false;
                        break;
                    }
                } else if (lastInStack == '[') {
                    if (firstInQueue != ']') {
                        areBalanced= false;
                        break;
                    }
                } else if (lastInStack == '(') {
                    if (firstInQueue != ')') {
                        areBalanced = false;
                        break;
                    }
                }
            }
        }

        if (openBracketsStack.isEmpty() && closeBracketsQueue.isEmpty() && areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

