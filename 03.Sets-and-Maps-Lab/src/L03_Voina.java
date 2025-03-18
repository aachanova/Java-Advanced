import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class L03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            if (firstPlayerCards.isEmpty() || secondPlayerCards.isEmpty()) {
                break;
            }

            int firstTopCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstTopCard);

            int secondTopCard = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondTopCard);

            if (firstTopCard > secondTopCard) {
                firstPlayerCards.add(firstTopCard);
                firstPlayerCards.add(secondTopCard);
            } else if (secondTopCard > firstTopCard) {
                secondPlayerCards.add(secondTopCard);
                secondPlayerCards.add(firstTopCard);
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
        } else if (secondSize > firstSize) {
            System.out.println("Second player win!");
        }
    }
}
