import java.util.Arrays;
import java.util.Scanner;

public class Ex01_1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        char pattern = input[1].charAt(0);

        int[][] matrix = new int[size][size];

        if (pattern == 'A') {
            matrix = fillAMatrix(size);
        } else {
            matrix = fillBMatrix(size);
        }

        printMatrix(matrix);
    }

    private static int[][] fillAMatrix(int size) {
        int[][] matrix = new int[size][size];
        int start = 0;
        for (int c = 0; c < size; c++) {
            for (int r = 0; r < size; r++) {
                matrix[r][c] = ++start;
            }
        }

        return matrix;
    }

    private static int[][] fillBMatrix(int size) {
        int[][] matrix = new int[size][size];
        int start = 0;
        for (int c = 0; c < size; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < size; r++) {
                    matrix[r][c] = ++start;
                }
            } else {
                for (int r = size - 1; r >= 0; r--) {
                    matrix[r][c] = ++start;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            Arrays.stream(row)
                    .forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }
}
