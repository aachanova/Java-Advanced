import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class Ex03_1_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < lines; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            int commandNumber = Integer.parseInt(command[0]);
            switch (commandNumber) {
                case 1 -> stack.push(Integer.parseInt(command[1]));
                case 2 -> stack.pop();
                case 3 -> System.out.println(stack.stream().max(Comparator.naturalOrder()).get());
            }
        }
    }
}
