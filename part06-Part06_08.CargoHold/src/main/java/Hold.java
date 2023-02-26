
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
       
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(!(totalWeight() + suitcase.totalWeight() > maxWeight)){
            suitcases.add(suitcase);
        }
    }
    
    private int totalWeight(){
        int weight = 0;
        for(Suitcase s : suitcases){
            weight += s.totalWeight();
        }
        return weight;
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
    
    
    
}
