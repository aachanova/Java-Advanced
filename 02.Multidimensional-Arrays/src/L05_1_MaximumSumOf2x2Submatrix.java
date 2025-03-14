import java.util.Arrays;
import java.util.Scanner;

public class L05_1_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];
        int maxSum = Integer.MIN_VALUE;
        int[][] maxMatrix = new int[2][2];

        for (int row = 0; row < rows; row++) {
                matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                        .mapToInt(Integer:: parseInt)
                        .toArray();
        }

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    for (int r = row; r <= row + 1; r++) {
                        System.arraycopy(matrix[r], col, maxMatrix[r - row], 0, 2);
                    }
                }
            }
        }

        for (int r = 0; r < 2; r++) {
            System.out.println(maxMatrix[r][0] + " " + maxMatrix[r][1]);
        }

        System.out.println(maxSum);
    }
}
