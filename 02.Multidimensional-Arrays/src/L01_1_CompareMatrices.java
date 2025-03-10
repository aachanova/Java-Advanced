import java.util.Scanner;

public class L01_1_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsFirst = scanner.nextInt();
        int colsFirst = scanner.nextInt();
        int[][] firstMatrix = new int[rowsFirst][colsFirst];

        for (int r = 0; r < rowsFirst; r++) {
            for (int c = 0; c < colsFirst; c++) {
                firstMatrix[r][c] = scanner.nextInt();
            }
        }

        scanner.nextLine();

        String[] secondMatrixInfo = scanner.nextLine().split("\\s+");
        int rowsSecond = Integer.parseInt(secondMatrixInfo[0]);
        int colsSecond = Integer.parseInt(secondMatrixInfo[1]);

        if (rowsFirst != rowsSecond || colsFirst != colsSecond) {
            System.out.println("not equal");
            return;
        }

        int[][] secondMatrix = new int[rowsSecond][colsSecond];

        for (int r2 = 0; r2 < rowsSecond; r2++) {
            String[] row = scanner.nextLine().split("\\s+");
            for (int c2 = 0; c2 < colsSecond; c2++) {
                secondMatrix[r2][c2] = Integer.parseInt(row[c2]);

                if (secondMatrix[r2][c2] != firstMatrix[r2][c2]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}
