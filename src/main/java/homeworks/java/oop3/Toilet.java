package homeworks.java.oop3;

public class Toilet extends Room{
    private String name;

    public Toilet(String name) {
        this.name = name;
    }

    @Override
    public String getRoomType () {
        return "Toilet";
    }

    @Override
    public String getDetails() {
        return name;
    }
}
