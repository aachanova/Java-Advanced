import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class L06_SortLines {
    public static void main(String[] args) throws IOException {

        List<String> sorted = Files.readAllLines(Path.of("input.txt"))
                .stream().sorted(String::compareTo).collect(Collectors.toList());

        Files.write(Path.of("output.txt"), sorted);
    }
}
