import java.util.Arrays;
import java.util.Scanner;

public class L06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(scanner, n);

        int row = 0, col = 0;
        while (row < n && col < n) {
            System.out.print(matrix[row++][col++] + " ");
        }
        System.out.println();
        row = n - 1;
        col = 0;
        while (row >= 0 && col < n) {
            System.out.print(matrix[row--][col++] + " ");
        }
    }

    private static int[][] readMatrix(Scanner scan, int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = readArray(scan);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
