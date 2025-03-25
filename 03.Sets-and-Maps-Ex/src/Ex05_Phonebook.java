import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phoneBook=new HashMap<>();
        String input;
        while (!"search".equals(input=scanner.nextLine())){
            phoneBook.put(input.split("-")[0],input.split("-")[1]);
        }
        while (!"stop".equals(input=scanner.nextLine())){
            if(phoneBook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phoneBook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n",input);
            }
        }
    }
}
