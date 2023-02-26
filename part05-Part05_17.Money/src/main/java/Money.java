
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money comp){
        if (comp.euros > this.euros){
            return true;
        } else if(comp.euros < this.euros){
            return false;
        } else{
            if(comp.cents <= this.cents){
                return false;
            } 
            return true;
        }
    }
    
    public Money minus(Money decreaser){
        int thisConvertedToCents = this.euros * 100 + this.cents;
        int decreaserConvertedToCents = decreaser.euros * 100 + decreaser.cents;
        int diff = thisConvertedToCents - decreaserConvertedToCents;
        if(diff < 0){
            return new Money(0, 0);
        } else{
            return new Money(diff/100, diff%100);
        }
    }

}
