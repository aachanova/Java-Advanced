import java.util.Scanner;

public class Ex06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Map<String, String> emailList = new LinkedHashMap<>();
        String input;
        while (!"stop".equals(input = scanner.nextLine())) {
            String email = scanner.nextLine();
            if (!email.endsWith(".com") && !email.endsWith(".uk") && !email.endsWith(".us")) {
                // emailList.put(input, email);
                System.out.printf("%s -> %s%n", input, email);
            }
        }
        //emailList.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
