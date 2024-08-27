package homeworks.java.oop3;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Floor> floors;

    public Building(String name, ArrayList<Floor> floors) {
        this.name = name;
        this.floors = floors;
    }

    public String printBuildingInfo() {
        String details = "Building " + this.name + " has " + floors.size() + " floors" + "\n";
        for (Floor f : floors) {
            details = details + f.displayRoomsDetails() + "\n";
        }
        return details;
    }
}
