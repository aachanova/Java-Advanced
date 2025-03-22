import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> infoList= IntStream.range(0, Integer.parseInt(scanner.nextLine()))
                .mapToObj(i -> scanner.nextLine().split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        infoList.stream().map(equals -> equals + " ").forEach(System.out::print);

    }
}
