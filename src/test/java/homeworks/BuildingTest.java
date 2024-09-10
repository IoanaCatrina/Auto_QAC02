package homeworks;


import homeworks.java.oop3.Building;
import homeworks.java.oop3.Floor;
import homeworks.java.oop3.OfficeSpace;
import homeworks.java.oop3.Room;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

@Test
public class BuildingTest {



    public void myTest() {
        ArrayList<Room> rooms = new ArrayList<>();
        Room officeRoom = new OfficeSpace("OfficeRoom", 25);
        rooms.add(officeRoom);
        ArrayList<Floor> floors = new ArrayList<>();
        Floor floor1 = new Floor(1, rooms);
        floors.add(floor1);
        Building myHome = new Building("myHome", floors);

        System.out.println(myHome.printBuildingInfo());
        String buildingInfo = myHome.printBuildingInfo();

        Assert.assertTrue(buildingInfo.contains("myHome"));
        
    }

}
