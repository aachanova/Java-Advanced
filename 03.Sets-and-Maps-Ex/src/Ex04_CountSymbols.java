import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Ex04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> infoList = new TreeMap<>();
        IntStream.range(0, input.length()).forEach(i -> infoList.put(input.charAt(i),
                !infoList.containsKey(input.charAt(i)) ? 1 : infoList.get(input.charAt(i)) + 1));
        infoList.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));

    }
}
