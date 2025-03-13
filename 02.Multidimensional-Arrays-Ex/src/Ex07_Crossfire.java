import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex07_Crossfire {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[][] matrix = fillTheMatrix(reader);
        String input;

        while (!"Nuke it from orbit".equals(input = reader.readLine())) {
            int[] data = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            removeElements(matrix, data[0], data[1], data[2]);
            matrix = Arrays.stream(matrix).filter(r -> Arrays.stream(r).count() != 0).toArray(Integer[][]::new);
        }
        Arrays.stream(matrix).forEach(integers -> System.out.println(
                Arrays.stream(integers).map(String::valueOf).collect(Collectors.joining(" "))));
    }

    private static boolean isInBounds(Integer[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void removeElements(Integer[][] matrix, int row, int col, int radius) {
        IntStream.rangeClosed(row - radius, row + radius).filter(r -> isInBounds(matrix, r, col) && r != row)
                .forEach(r -> matrix[r][col] = null);
        IntStream.rangeClosed(col - radius, col + radius).filter(c -> isInBounds(matrix, row, c))
                .forEach(c -> matrix[row][c] = null);
        IntStream.range(0, matrix.length).forEach(r -> matrix[r] = Arrays.stream(matrix[r])
                .filter(Objects::nonNull).toArray(Integer[]::new));
    }

    private static Integer[][] fillTheMatrix(BufferedReader reader) throws IOException {
        int[] sizeOfMatrix = Arrays.stream(reader.readLine().split("\\s+"))
                .limit(2).mapToInt(Integer::parseInt).toArray();
        Integer[][] matrix = new Integer[sizeOfMatrix[0]][sizeOfMatrix[1]];
        final int[] count = {1}; // Използваме масив, за да можем да променяме стойността на count
        for (int row = 0; row < sizeOfMatrix[0]; row++) {
            for (int col = 0; col < sizeOfMatrix[1]; col++) {
                matrix[row][col] = count[0]++;
            }
        }
        return matrix;
    }
}
