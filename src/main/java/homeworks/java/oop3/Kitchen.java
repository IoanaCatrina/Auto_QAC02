package homeworks.java.oop3;

public class Kitchen extends Room {
    private String name;
    String[] apliances = {"coffee machine", "water dispenser", "fridge"};

    public Kitchen(String name) {
        this.name = name;
    }

    @Override
    public String getRoomType() {
        return "kitchen";
    }

    @Override
    public String getDetails() {
        return name;
    }
}
