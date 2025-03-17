import java.util.Scanner;

public class Ex03_1_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int primarySum = getPrimarySum(matrix);
        int secondarySum = getSecondarySum(matrix);

        System.out.println(Math.abs(primarySum - secondarySum));
    }

    private static int getSecondarySum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == matrix.length - col - 1) {
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
    }

    private static int getPrimarySum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
    }
}
