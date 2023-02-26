
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + name + " is empty.";
        }

        String output = "The collection " + name + " has " + elements.size();
        if (elements.size() == 1) {
            output += " element:\n";
        } else {
            output += " elements:\n";
        }
        for (String el : elements) {
            if (elements.size() <= 1) {
                output += el;
            } else {
                output += el + "\n";
            }
        }
        return output;
    }

}
