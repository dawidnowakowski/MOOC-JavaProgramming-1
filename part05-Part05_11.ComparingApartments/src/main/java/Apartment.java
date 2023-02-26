
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return (this.squares > compared.squares);
    }
    
    public int priceDifference(Apartment compared){
        int objPrice = squares*pricePerSquare;
        int compPrice = compared.squares * compared.pricePerSquare;
        int diff = objPrice - compPrice;
        if(diff < 0){
            diff *= -1;
        }
        return diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return squares*pricePerSquare > compared.squares * compared.pricePerSquare;
    }

}
