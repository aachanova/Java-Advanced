import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> firstList = IntStream.range(0, size[0]).mapToObj(i -> Integer.parseInt(scanner.nextLine()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondList = IntStream.range(0, size[1]).mapToObj(i -> Integer.parseInt(scanner.nextLine()))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        firstList.stream().filter(secondList::contains).map(equals -> equals + " ").forEach(System.out::print);
    }
}
