package homeworks.java.oop3;

import java.util.ArrayList;

public class Floor {
    private int floorNumber;
    private ArrayList<Room> rooms;

    public Floor(int floorNumber, ArrayList<Room> rooms) {
        this.floorNumber = floorNumber;
        this.rooms = rooms;
    }

    public void displayRooms() {
        System.out.println("Floor " + floorNumber + ":");
        for (Room r : rooms) {
            System.out.println(r.getDetails());
        }
    }

}
