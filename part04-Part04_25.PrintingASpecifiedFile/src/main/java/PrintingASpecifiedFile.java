
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingASpecifiedFile {
    
    public static void printFile(String path){
        try {
            Scanner scanner = new Scanner(Paths.get(path));
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine();
        printFile(input);
        
        
    }
}
