import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Predicate<String> lessOrEqualsLength = s -> s.length() <= length;
        Arrays.stream(scanner.nextLine().split("\\s+")).filter(lessOrEqualsLength).forEach(System.out::println);
    }
}
