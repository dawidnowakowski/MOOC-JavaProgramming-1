
public class Statistics {
    private int counter;
    private int sum;
    
    public void addNumber(int number){
        counter++;
        sum+=number;
    }
    
    public int getCount(){
        return counter;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(counter==0){
            return 0;
        }
        return (double)sum/counter;
    }
}
