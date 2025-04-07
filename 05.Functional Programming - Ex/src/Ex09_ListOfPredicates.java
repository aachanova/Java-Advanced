import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());
        Predicate<Integer> isdDivisible = num -> {
            for (Integer number : numbers) {
                if (num % number != 0) {
                    return false;
                }
            }
            return true;
        };
        IntStream.range(1, n + 1).filter(isdDivisible::test).forEach(i -> System.out.printf("%d ", i));
    }
}
