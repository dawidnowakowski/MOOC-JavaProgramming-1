/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String n, int w){
        name = n;
        weight = w;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public String toString(){
        return name+" ("+weight+" kg)";
    }
    
}
