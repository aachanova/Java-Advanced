import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class L03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            int firstTopCard = firstPlayerCards.iterator().next();
            int secondTopCard = secondPlayerCards.iterator().next();

            firstPlayerCards.remove(firstTopCard);
            secondPlayerCards.remove(secondTopCard);

            if (firstTopCard > secondTopCard) {
                firstPlayerCards.add(firstTopCard);
                firstPlayerCards.add(secondTopCard);
            } else if (secondTopCard > firstTopCard) {
                secondPlayerCards.add(firstTopCard);
                secondPlayerCards.add(secondTopCard);
            }

            if (firstPlayerCards.isEmpty() || secondPlayerCards.isEmpty()) {
                break;
            }
        }

        int firstSize = firstPlayerCards.size();
        int secondSize = secondPlayerCards.size();

        if (firstSize == secondSize) {
            System.out.println("Draw!");
        } else if (firstSize > secondSize) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}
