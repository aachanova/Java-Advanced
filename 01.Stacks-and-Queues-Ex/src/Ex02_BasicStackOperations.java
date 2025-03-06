import java.util.*;
import java.util.stream.Collectors;

public class Ex02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n_numberToPush = Integer.parseInt(input[0]);
        int s_numberToPop = Integer.parseInt(input[1]);
        int x_numberToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.stream()
                .limit(n_numberToPush)
                .forEach(stack::push);

        stack.stream()
                .limit(s_numberToPop)
                .forEach(e -> stack.pop());

        if (stack.contains(x_numberToSearch)) {
            System.out.println("true");
        } else {
            System.out.println(stack.stream()
                    .min(Comparator.naturalOrder())
                    .orElse(0));
        }
    }
}
