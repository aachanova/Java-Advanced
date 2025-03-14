import java.util.Scanner;

public class L06_1_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    System.out.printf("%d ", matrix[row][col]);
                }
            }
        }

        System.out.println();

        int col = -1;
        for (int row = size - 1; row >= 0; row--) {
            System.out.printf("%d ", matrix[row][++col]);
        }
    }
}
