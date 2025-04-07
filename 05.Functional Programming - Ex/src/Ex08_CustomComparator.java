import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = ((x1, x2) -> {
            if (x1 % 2 != 0 && x2 % 2 == 0) {
                return 1;
            } else if (x1 % 2 == 0 && x2 % 2 != 0) {
                return -1;
            }
            return x1.compareTo(x2);
        });
        numbers.stream().sorted(comparator).forEach(e -> System.out.printf("%d ", e));
    }
}
