/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Fitbyte {
    private int age;
    private int restingHR;
    
    
    public Fitbyte(int age, int restingHR){
        this.age = age;
        this.restingHR = restingHR;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHR = 206.3 - (0.711*age);
        
        
        return (maximumHR - restingHR) * percentageOfMaximum + restingHR; 
    }
}
