package homeworks.java.oop3;

public class OfficeSpace extends Room {
    private String name;
    private int deskNumber;

    public OfficeSpace(String name, int deskNumber) {
        this.name = name;
        this.deskNumber = deskNumber;
    }

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }

    @Override
    public String getRoomType() {
        return "Office Space";
    }

    @Override
    public String getDetails() {
        return  name + ": " + deskNumber + " desks";
    }
}
