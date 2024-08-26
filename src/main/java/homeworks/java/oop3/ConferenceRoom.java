package homeworks.java.oop3;

public class ConferenceRoom extends Room {
    private String name;
    private int seatNumber;

    public ConferenceRoom(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getRoomType() {
        return "Conference Room";
    }

    @Override
    public String getDetails() {
        return  name + ": " + seatNumber + " seats";
    }

    /* public boolean hasVideoprojector() {
        if (seatNumber == 30) {
            return true;
        } else return false;
    }*/
}
