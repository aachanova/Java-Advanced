import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class L04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> vatAdder= vat->vat*1.20;
        String values = Arrays.stream(scanner.nextLine().split(", "))
                .map(e -> String.format("%.2f", vatAdder.apply(Double.parseDouble(e))))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.printf("Prices with VAT:%n%s",values);
    }
}
