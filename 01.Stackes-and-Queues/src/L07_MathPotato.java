import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class L07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int toss = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>(List.of(input.split("\\s+")));
        int cycle = 0;

        while (children.size() > 1) {
            cycle++;
            for (int i = 1; i <= toss - 1; i++) {
                children.offer(children.poll());
            }

            if (isCyclePrime(cycle)) {
                System.out.printf("Prime %s%n", children.peek());
            } else {
                System.out.printf("Removed %s%n", children.poll());
            }
        }

        System.out.printf("Last is %s", children.poll());
    }

    private static boolean isCyclePrime(int count) {
        if (count > 1) {
            for (int i = 2; i <= Math.sqrt(count); i++) {
                if (count % i == 0) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
