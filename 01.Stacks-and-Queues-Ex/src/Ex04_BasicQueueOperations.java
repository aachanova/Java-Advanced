import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] info = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numsToAdd = info[0];
        int numsToRemove = info[1];
        int numsToSearch = info[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(numsToAdd)
                .forEach(queue::offer);

        for (int i = 0; i < numsToRemove; i++) {
            queue.poll();
        }

        if (queue.contains(numsToSearch)) {
            System.out.println("true");
        } else {
            System.out.println(queue.stream()
                    .min(Comparator.naturalOrder())
                    .orElse(0));
        }
    }
}
