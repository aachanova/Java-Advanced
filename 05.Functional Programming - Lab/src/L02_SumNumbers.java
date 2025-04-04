import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class L02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Function<String, IntStream> getIntStream = stringInput -> Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt);
        System.out.printf("Count = %d%nSum = %d", getIntStream.apply(input).count(), getIntStream.apply(input).sum());
    }
}
