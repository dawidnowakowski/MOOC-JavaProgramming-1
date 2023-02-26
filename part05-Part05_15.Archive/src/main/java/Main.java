
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String ID = scanner.nextLine();
            if(ID.isEmpty()){
                break;
            }
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item temp = new Item(name, ID);
            if(items.contains(temp)){
                continue;
            }
            items.add(temp);
            
            
        }
        
        System.out.println("==Items==");
        for(Item item : items){
            System.out.println(item);
        }


    }
}
