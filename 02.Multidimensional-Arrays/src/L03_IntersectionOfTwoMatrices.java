import java.util.Scanner;
import java.util.stream.IntStream;

public class L03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);

        char[][] output = new char[rows][cols];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                output[i][j] = firstMatrix[i][j] == secondMatrix[i][j] ? firstMatrix[i][j] : '*';
            }
        }
        printMatrix(output);

    }

    private static void printMatrix(char[][] output) {
        for (char[] current : output) {
            IntStream.range(0, current.length).forEach(j -> System.out.printf("%c ", current[j]));
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan) {

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan);
        }
        return matrix;
    }

    private static char[] readArray(Scanner scan) {
        return scan.nextLine()
                .replaceAll("\\s+", "").toCharArray();
    }
}
