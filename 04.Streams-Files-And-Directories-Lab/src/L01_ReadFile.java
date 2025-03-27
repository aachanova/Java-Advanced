import java.io.FileInputStream;
import java.io.IOException;

public class L01_ReadFile {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("input.txt");
        int singleByte ;
        while ((singleByte=inputStream.read()) >= 0) {
            System.out.printf("%s ",Integer.toBinaryString(singleByte));
        }
        inputStream.close();
    }
}
