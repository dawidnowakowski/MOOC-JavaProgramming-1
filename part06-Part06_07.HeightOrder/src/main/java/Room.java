/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        people = new ArrayList<>();
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return people;
    }
    
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        
        Person shortest = people.get(0);
        
        for(Person unit : people){
            if (unit.getHeight() < shortest.getHeight()){
                shortest = unit;
            }
        }
        
        return shortest;
        
    }
    
    public Person take(){
        Person shortest = shortest();
        people.remove(shortest);
        return shortest;
    }
    
}

