
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = ""; 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] temp = input.split(",");
            int age = Integer.valueOf(temp[1]);
            if (age > oldest) {
                oldest = age;
                oldestName = temp[0];
            }

        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
