
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int counter=0;

        int sumOfYears = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            counter++;
            String[] temp = input.split(",");
            sumOfYears += Integer.valueOf(temp[1]);
            if(temp[0].length() > longestName.length()){
                longestName = temp[0];
            }
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: " + (double)sumOfYears/counter);
        

    }
}
