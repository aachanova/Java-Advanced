import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> userList = IntStream.range(0, n).mapToObj(i -> scanner.nextLine())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        userList.forEach(System.out::println);
    }
}


