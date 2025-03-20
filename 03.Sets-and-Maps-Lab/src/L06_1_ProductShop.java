import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] shopInfo = input.split(", ");
            String shop = shopInfo[0];
            String product = shopInfo[1];
            double price = Double.parseDouble(shopInfo[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        shops.forEach((k, v) -> {
            System.out.println(k + "->");
            v.forEach((k1, v1) -> {
                System.out.printf("Product: %s, Price: %.1f%n", k1, v1);
            });
        });
    }
}
