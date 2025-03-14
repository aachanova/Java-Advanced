import java.util.Arrays;
import java.util.Scanner;

public class L08_1_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][];
        int[][] resultedMatrix = new int[size][];

        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            resultedMatrix[row] = Arrays.copyOf(matrix[row], matrix[row].length);

        }

        int searchedRow = scanner.nextInt();
        int searchedCol = scanner.nextInt();

        int number = matrix[searchedRow][searchedCol];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == number) {
                    resultedMatrix[r][c] = sumElements(matrix, number, r, c);
                }
            }
        }

        printMatrix(resultedMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println();
        }
    }

    private static int sumElements(int[][] matrix, int number, int row, int col) {
        int sum = 0;

        if (row - 1 >= 0 && matrix[row - 1][col] != number) {
            sum += matrix[row - 1][col];
        }

        if (row + 1 < matrix.length && matrix[row + 1][col] != number) {
            sum += matrix[row + 1][col];
        }

        if (col - 1 >= 0 && matrix[row][col - 1] != number) {
            sum += matrix[row][col - 1];
        }

        if (col + 1 < matrix[row].length && matrix[row][col + 1] != number) {
            sum += matrix[row][col + 1];
        }

        return sum;
    }
}
