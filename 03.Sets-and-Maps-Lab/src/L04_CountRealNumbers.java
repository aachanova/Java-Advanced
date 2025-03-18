import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> numbersCountInfo=new LinkedHashMap<>();
        for (double number : numbers) {
            numbersCountInfo.put(number,!numbersCountInfo.containsKey(number)
                    ? 1 : numbersCountInfo.get(number)+1);
        }
        numbersCountInfo.forEach((key,value)-> System.out.printf("%.1f -> %d%n",key,value));
    }
}
