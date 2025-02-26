import java.util.*;

public class L06_HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int toss = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> children = new ArrayDeque<>(List.of(input.split("\\s+")));

        while (children.size() > 1) {
            for (int i = 0; i < toss - 1; i++) {
                children.offer(children.poll());
            }

            System.out.printf("Removed %s%n", children.poll());
        }

        System.out.printf("Last is %s", children.poll());
    }
}
