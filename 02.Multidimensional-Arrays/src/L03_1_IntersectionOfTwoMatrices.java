import java.util.Arrays;
import java.util.Scanner;

public class L03_1_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        char[][] first = readMatrix(scanner, rows);
        char[][] second = readMatrix(scanner, rows);
        char[][] resulted = first;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (first[r][c] != second[r][c]) {
                    resulted[r][c] = '*';
                }
            }
        }

        printMatrix(resulted);
    }

    private static char[][] readMatrix(Scanner scanner, int rows) {
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println();
        }
    }
}
