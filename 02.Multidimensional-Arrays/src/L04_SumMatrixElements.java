import java.util.Arrays;
import java.util.Scanner;

public class Ex04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);

        System.out.printf("%d%n%d%n%d%n", matrix.length, matrix[0].length,
                Arrays.stream(matrix).mapToInt(arr->Arrays.stream(arr).sum()).sum());
    }

    private static int[][] readMatrix(Scanner scan) {
        int[] size = readArray(scan);
        int rows = size[0],cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}
