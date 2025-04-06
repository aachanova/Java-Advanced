import java.util.Arrays;
import java.util.Scanner;

public class Ex03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).min().orElse(0));
    }
}
