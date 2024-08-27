package homeworks.java.oop3;

import java.util.Arrays;

public class Kitchen extends Room {
    private String name;
    String[] appliances = {"coffee machine", "water dispenser", "fridge"};


    public Kitchen(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return this.name + ": " + Arrays.toString(appliances);
    }


}
