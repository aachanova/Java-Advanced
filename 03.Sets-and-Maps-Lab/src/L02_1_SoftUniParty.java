import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class L02_1_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!guest.equals("PARTY")) {
            if (Character.isDigit(guest.charAt(0))) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }

            guest = scanner.nextLine();
        }

        while (!guest.equals("END")) {
            if (Character.isDigit(guest.charAt(0))) {
                vip.remove(guest);
            } else {
                regular.remove(guest);
            }

            guest = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
