package homeworks.java.oop3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//     Floor 1
        ArrayList<Room> rooms = new ArrayList<>();
        Room os1 = new OfficeSpace("Office space 1", 20);
        Room t1 = new Toilet("Toilet 1");
        Room t2 = new Toilet("Toilet 2");
        Room k1 = new Kitchen("Kitchen 1");
        Room cr1 = new ConferenceRoom("Conference room 1", 10, 1);
        Room cr2 = new ConferenceRoom("Conference room 2", 10, 1);
        Room cr3 = new ConferenceRoom("Conference room 3", 10, 1);

        rooms.add(os1);
        rooms.add(t1);
        rooms.add(t2);
        rooms.add(k1);
        rooms.add(cr1);
        rooms.add(cr2);
        rooms.add(cr3);

        ArrayList<Floor> floors = new ArrayList<>();
        floors.add(new Floor(1, rooms));

//        Floor 2
        ArrayList<Room> rooms2 = new ArrayList<>();
        Room os2 = new OfficeSpace("Office Space 2", 10);
        Room os3 = new OfficeSpace("Office Space 3", 10);
        Room t3 = new Toilet("Toilet 3");
        Room t4 = new Toilet("Toilet 4");
        Room k2 = new Kitchen("Kitchen 2");
        Room cr4 = new ConferenceRoom("Conference room 4", 8, 2);
        Room cr5 = new ConferenceRoom("Conference room 5", 8, 2);
        Room cr6 = new ConferenceRoom("Conference room 6", 8, 2);
        Room cr7 = new ConferenceRoom("Conference room 7", 8, 2);


        rooms2.add(os2);
        rooms2.add(os3);
        rooms2.add(t3);
        rooms2.add(t4);
        rooms2.add(k2);
        rooms2.add(cr4);
        rooms2.add(cr5);
        rooms2.add(cr6);
        rooms2.add(cr7);


        floors.add(new Floor(2, rooms2));

//        Floor 3
        ArrayList<Room> rooms3 = new ArrayList<>();
        Room t5 = new Toilet("Toilet 5");
        Room t6 = new Toilet("Toilet 6");
        Room cr8 = new ConferenceRoom("Conference room 8", 30, 3);
        Room cr9 = new ConferenceRoom("Conference room 9", 20, 3);
        Room cr10 = new ConferenceRoom("Conference room 10", 10, 3);
        Room cr11 = new ConferenceRoom("Conference room 11", 10, 3);
        Room cr12 = new ConferenceRoom("Conference room 12", 10, 3);
        Room cr13 = new ConferenceRoom("Conference room 13", 10, 3);

        rooms3.add(t5);
        rooms3.add(t6);
        rooms3.add(cr8);
        rooms3.add(cr9);
        rooms3.add(cr10);
        rooms3.add(cr11);
        rooms3.add(cr12);
        rooms3.add(cr13);

        floors.add(new Floor(3,rooms3));

        Building ioanaBuilding = new Building("Ioana", floors);
        System.out.println(ioanaBuilding.printBuildingInfo());

    }
}
