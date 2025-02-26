import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        ArrayDeque<Integer> numbers = new ArrayDeque<>(Arrays.asList(input));
        ArrayDeque<Integer> reversed = new ArrayDeque<>();

        for (Integer num : numbers) {
            reversed.push(num);
        }

        for (Integer num : reversed) {
            System.out.print(num + " ");
        }
    }
}
