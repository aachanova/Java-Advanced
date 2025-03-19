import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shopsInfo = new TreeMap<>();
        String input;
        while (!"Revision".equals(input = scanner.nextLine())) {
            String[] inputData = input.split(", ");
            shopsInfo.putIfAbsent(inputData[0], new LinkedHashMap<>());
            shopsInfo.get(inputData[0]).putIfAbsent(inputData[1], Double.parseDouble(inputData[2]));
        }
        shopsInfo.forEach((key, value) -> {
            System.out.printf("%s->%n", key);
            value.forEach((key1, value1) ->
                    System.out.printf("Product: %s, Price: %.1f%n", key1, value1));
        });
    }
}
