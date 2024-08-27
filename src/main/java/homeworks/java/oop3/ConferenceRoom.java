package homeworks.java.oop3;

public class ConferenceRoom extends Room {
    private String name;
    private int seatNumber;
    private int floorNumber;

    public ConferenceRoom(String name, int seatNumber, int floorNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.floorNumber = floorNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getDetails() {
        String details = this.name + ": " + this.seatNumber + " seats";
        if (hasTelepresence()) {
            details = details + "\n" + "Conference equipment - Telepresence";
        }
        return details + "\n" + getDevice();
    }

    public String getDevice() {
        if (seatNumber == 30) {
            return "Device: Video projector";
        } else {
            return "Device: TV";
        }
    }

    public boolean hasTelepresence() {
        if (floorNumber == 3) {
            return true;
        } else return false;
    }


}
