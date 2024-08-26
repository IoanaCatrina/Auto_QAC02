package homeworks.java.oop3;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Floor> floors;


    public Building(String name, ArrayList<Floor> floors) {
        this.name = name;
        this.floors = floors;
    }
    public void printBuildingInfo(){
    System.out.println("Building " + this.name + " has " + floors.size() +  " floors");
    for (Floor f : floors) {
       f.displayRooms();
    }


}

}
