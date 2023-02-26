/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Counter {

    private int number;

    public Counter(int startVal) {
        number = startVal;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return number;
    }

    public void increase() {
        increase(1);
    }

    public void increase(int number) {
        if (number > 0) {
            this.number += number;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int number) {
        if (number > 0) {
            this.number -= number;
        }
    }
}
