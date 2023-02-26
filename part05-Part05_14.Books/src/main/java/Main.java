
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
//        String one = "Witcher";
//        String two = "Witcher";
        
        Book book1 = new Book("Witcher", 1990);
        Book book2 = new Book("Witcher", 1990);
        books.add(book1);
        if (books.contains(book2)) { // this is TRUE
            System.out.println("The book is already on the list. Let's not add the same book again.");
        }
        System.out.println(book1.equals(book2)); //prints true
        
        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(name, publicationYear);

            if (books.contains(book)) { // this is false 
               System.out.println("Already on the list");
                continue;
            }
            books.add(book);
        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
