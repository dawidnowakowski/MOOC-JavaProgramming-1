/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Cube {
    private int edgeLen;
    
    public Cube(int edgeLen){
        this.edgeLen = edgeLen;
    }
    
    public int volume(){
        return edgeLen * edgeLen * edgeLen; 
    }
    
    public String toString(){
        return "The length of the edge is "+edgeLen+" and the volume "+volume();
    }
}
