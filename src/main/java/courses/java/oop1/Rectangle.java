package courses.java.oop1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getDiagonal() {
        return Math.sqrt((this.length * this.length) + (this.width * this.width));

    }
}
