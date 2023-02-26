
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String login = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String passwd = scanner.nextLine();
        
        if((login.equals("alex") && passwd.equals("sunshine")) || (login.equals("emma") && passwd.equals("haskell")) ){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }
    }
}
