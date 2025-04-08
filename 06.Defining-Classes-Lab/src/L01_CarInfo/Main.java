package L01_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carCollection = new ArrayList<>();

        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String brand = carData[0];
            Car car = null;

            if (carData.length == 1) {
                car = new Car(brand);
            } else {
                String model = carData[1];
                int horsePower = Integer.parseInt(carData[2]);
                car = new Car(brand, model, horsePower);
            }

            carCollection.add(car);
        }

        carCollection.forEach(c -> System.out.println(c.carInfo()));
    }
}
