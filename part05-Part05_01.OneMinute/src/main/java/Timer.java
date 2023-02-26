///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Dawid
// */
//public class Timer {
//    private ClockHand hundredsOfSeconds;
//    private ClockHand seconds;
//    
//    public Timer(){
//        hundredsOfSeconds = new ClockHand(100);
//        seconds = new ClockHand(60);
//    }
//    
//    public void advance(){
//        hundredsOfSeconds.advance();
//        if(hundredsOfSeconds.value() ==0){
//            seconds.advance();
//        }
//    }
//    
//    public String toString(){
//        String output = "";
//        if(seconds.value()<10){
//            output += "0"+seconds.value();
//        } else{
//            output += ""+seconds.value();
//        }
//        
//        if(hundredsOfSeconds.value()<10){
//            output += ":0"+hundredsOfSeconds.value();
//        } else{
//            output += ":"+hundredsOfSeconds.value();
//        }
//        return output;
//    }
//}

 
public class Timer {
 
    private ClockHand seconds;
    private ClockHand hundredths;
 
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
 
    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
 
    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
 
}