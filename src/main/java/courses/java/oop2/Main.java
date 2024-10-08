package courses.java.oop2;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setVertices(1);
        c1.setRadius(5);
        c1.setColor("green");
//        System.out.println("The color of the circle is " + c1.getColor());
        c1.printCircle();

        Circle c2 = new Circle("white", 1, 7);
        Circle c3 = new Circle("green", 1, 5);
//        System.out.println("The color of the circle is " + c2.getColor());
        c2.printCircle();
        c3.printCircle();
        c3.setColor("blue");

//        Static call
        System.out.println("Static call");
        Utils.printCircleStatic(c3);

        Rectangle r1 = new Rectangle();
        Square sq1 = new Square(5);

        System.out.println(sq1.getArea());

//        Polymorphism
        Shape r2 = new Rectangle(6, 7);
        Shape sq2 = new Square(8);


     }
}
