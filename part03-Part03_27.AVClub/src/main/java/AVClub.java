
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            } 
            
            String[] temp = input.split(" ");
            for(int i=0; i<temp.length; i++){
                if(temp[i].contains("av")){
                    System.out.println(temp[i]);
                }
            }
            
        }

    }
}
