package L03_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Person data = new Person(input[0], Integer.parseInt(input[1]));
            personList.add(data);
        }
        personList.stream().filter(data -> data.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(data -> System.out.println(data.output()));
    }
}
