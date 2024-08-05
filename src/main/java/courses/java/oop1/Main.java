package courses.java.oop1;

public class Main {
    public static void main(String[] args) {

//   Instantiere obiect de tip pixuri
        Pixuri pixulVerdeGri = new Pixuri();

//    Initializare atribute
        pixulVerdeGri.culoare = "verde";
        pixulVerdeGri.culoarePasta = "albastru";
        pixulVerdeGri.tip = "gel";
        pixulVerdeGri.grosime = 2;
        pixulVerdeGri.lungime = 12;

        System.out.println(pixulVerdeGri.scrie());
        pixulVerdeGri.scrie("Primul meu obiect in Java");

        MathNew math = new MathNew();
        System.out.println("Suma:" + math.suma( 2, 3));
        System.out.println("Diferenta:" + math.difference(3,2));
        System.out.println("Numarul 5 este impar:" + math.isOddNumber(5));
        System.out.println("Numarul 6 este par" + math.isOddNumber(6));

        System.out.println("-------------------------------------------------");

//        Apelare metoda statica dintr-o clasa
        Draw.drawFullShape(3, 2);

        System.out.println("-------------------------------------------------");

        Draw.drawShapeOutline(7,8);
        Draw.drawSquare(5);

        System.out.println("-------------------------------------------------");

//    Constructor custom
        Square square = new Square(7);
        square.draw();
        System.out.println("Aria patratului este:" + square.getArea());

        System.out.println("-------------------------------------------------");

//        Constructor default with set method
        Square square1 = new Square();
        square1.setSide(5);
        System.out.println("Square side:" + square1.getSide());
        square1.draw();
        System.out.println(square1.getArea());

//        Protected values
        System.out.println("Perimeter:" + square1.getSide());

        System.out.println("-------------------------------------------------");

        Circle circle = new Circle(5.4);
        System.out.println("Circle area:" + circle.getArea());

        System.out.println("-------------------------------------------------");

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter:" + rectangle.getPerimeter());
        System.out.println("Diagonal:" + rectangle.getDiagonal());
    }
}
