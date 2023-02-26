/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Item {
    private String name;
    private String ID;
    
    public Item(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    
    public String toString(){
        return ID+": "+name;
    }
    
    public boolean equals(Object comp){
        if(comp == this){
            return true;
        }
        
        if(!(comp instanceof Item)){
            return false;
        }
        
        Item c = (Item) comp;
        
        if(this.ID.equals(c.ID)){
            return true;
        }
        
        return false;
        
    }
    
}
