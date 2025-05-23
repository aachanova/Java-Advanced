import java.util.*;
import java.util.stream.Collectors;

public class L05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < lines; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            double grade = Double.parseDouble(info[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.forEach((key, value) -> {
            String gradesAsStrings = value.stream()
                    .map(grade -> String.format("%.2f", grade))
                    .collect(Collectors.joining(" "));

            System.out.printf("%s -> %s (avg: %.2f)%n", key, gradesAsStrings, getAverage(value));
        });
    }

    private static double getAverage(List<Double> value) {
        double sum = 0.0;
        for (Double grade : value) {
            sum += grade;
        }
        return sum / value.size();

    }
}
