
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                int temp = Integer.valueOf(fileReader.nextLine());
                if(temp >= lowerBound && temp <= upperBound){
                    counter++;
                }
            }
            
            
        } catch(Exception e){
            System.out.println("Error");
        }
        
        System.out.println("Numbers: "+counter);

    }

}
