
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i=0; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i);
            
        }
    }
    
    public static void printTriangle2(int size) {
        for(int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i+(i-1));
            
        }
    }

    public static void christmasTree(int height) {
        printTriangle2(height);
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
