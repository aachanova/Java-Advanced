import java.util.Arrays;
import java.util.Scanner;

public class L04_1_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(scanner, rows, cols);
        int sum = sumMatrixElements(matrix);

        StringBuilder output = new StringBuilder();
        output.append(rows).append("\n");
        output.append(cols).append("\n");
        output.append(sum);

        System.out.println(output);
    }

    private static  int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return  matrix;
    }

    private static int sumMatrixElements(int[][] matrix) {
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }

        return sum;
    }
}
