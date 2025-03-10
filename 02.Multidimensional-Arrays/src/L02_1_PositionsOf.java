import java.util.Arrays;
import java.util.Scanner;

public class L02_1_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readRow(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][];
        boolean isFound = false;

        for (int row = 0; row < rows; row++) {
            matrix[row] = readRow(scanner);
        }

        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (isEqual(matrix, row, col, number)) {
                    isFound = true;
                    System.out.println(getPosition(matrix, row, col));
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static boolean isEqual(int[][] matrix, int row, int col, int number) {
        return matrix[row][col] == number;
    }

    private static String getPosition(int[][] matrix, int row, int col) {
        return String.format("%d %d", row, col);
    }

    private static int[] readRow(Scanner scanner) {
        int[] row = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return row;
    }
}
