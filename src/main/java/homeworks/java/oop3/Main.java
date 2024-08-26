package homeworks.java.oop3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //   Floor 1
        Room os1 = new OfficeSpace("Office space 1", 20);
        Room t1 = new Toilet("Toilet 1");
        Room t2 = new Toilet("Toilet 2");
        Room k1 = new Kitchen("Kitchen 1");
        Room cr1 = new ConferenceRoom("Conference room 1", 10);
        Room cr2 = new ConferenceRoom("Conference room 2", 10);
        Room cr3 = new ConferenceRoom("Conference room 3", 10);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(os1);
        rooms.add(t1);
        rooms.add(t2);
        rooms.add(k1);
        rooms.add(cr1);
        rooms.add(cr2);
        rooms.add(cr3);

        ArrayList<Floor> floors = new ArrayList<>();
        floors.add(new Floor(1, rooms));

        //floors.add(new Floor(2));
        //floors.add(new Floor(3));


        Building ioanaBuilding = new Building("Ioana", floors);

        ioanaBuilding.printBuildingInfo();




    }
}
