package homeworks.java.oop3;

import java.util.ArrayList;

public class Floor {
    private int floorNumber;
    private ArrayList<Room> rooms;

    public Floor(int floorNumber, ArrayList<Room> rooms) {
        this.floorNumber = floorNumber;
        this.rooms = rooms;
    }

    public String displayRoomsDetails() {
        String details = "Floor " + this.floorNumber + ":";
        for (Room r : rooms) {
            details = details + "\n" + r.getDetails() ;
        }
        return details + "\n";
    }
}
