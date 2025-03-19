import java.util.*;

public class L07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> cities = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");//continent country city
            String continent = input[0], country = input[1], city = input[2];
            cities.putIfAbsent(continent, new LinkedHashMap<>());
            cities.get(continent).putIfAbsent(country, new ArrayList<>());
            cities.get(continent).get(country).add(city);
        }
        cities.forEach((key, value) -> {
            System.out.printf("%s:%n", key);
            value.forEach((k, v) -> System.out.printf("  %s -> %s%n", k, String.join(", ", v)));
        });
    }
}
