
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if(firstName.equals("")){
                break;
            }
            
            System.out.println("Last name: ");
            String secondName = scanner.nextLine();
            System.out.println("Identification number: ");
            String ID = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, secondName, ID));
        
            
        }
        
        for(PersonalInformation unit : infoCollection){
            System.out.println(unit.getFirstName()+" "+unit.getLastName());
        }

    }
}
