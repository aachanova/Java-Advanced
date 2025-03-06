import java.util.Arrays;
import java.util.Scanner;

public class L02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]matrix=readMatrix(scanner);
        int number=Integer.parseInt(scanner.nextLine());

        findNumberInMatrix(number,matrix);

    }

    private static void findNumberInMatrix(int number, int[][] matrix) {
        boolean isNotFind=true;
        for (int row = 0; row < matrix.length; row++) {
            int[]current=matrix[row];
            for (int col = 0; col < current.length; col++) {
                if(current[col]==number){
                    System.out.printf("%d %d%n",row,col);
                    isNotFind=false;
                }
            }
        }
        if(isNotFind){
            System.out.println("not found");
        }
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
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
