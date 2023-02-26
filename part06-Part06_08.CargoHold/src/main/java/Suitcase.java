
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxW){
        items = new ArrayList<>();
        maxWeight = maxW;
    }
    
    public void addItem(Item item){
        if(!(totalWeight() + item.getWeight() > maxWeight)){
            items.add(item);
        }
    }
    
    public int totalWeight(){
        int sum = 0;
        if(items.isEmpty()){
            return 0;
        }
        for(Item item : items){
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        if(items.isEmpty()) return "no items (0 kg)";
        if(items.size() == 1) return "1 item (" + totalWeight() + " kg)";
        if(items.size() > 1) return items.size() + " items (" + totalWeight() + " kg)";
        return null;
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item item = items.get(0);
        
        for(Item i : items){
            if(i.getWeight() >= item.getWeight()){
                item = i;
            }
        }
        return item;
    }
    
}
