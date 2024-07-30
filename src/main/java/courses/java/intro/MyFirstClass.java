package courses.java.intro;

public class MyFirstClass {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        Define variables
        int x;

        x = 10;
        System.out.println(x);
        boolean isPrime = true;

        char ch = 'A';
//        Constanta
        final double PI = 3.14;
        System.out.println(PI * 12 * 12);

//         String is immutable
        String firstName = "Popescu Ion";
        firstName = "Vasile P";

        System.out.println("division: " + ((float) 5 / 2));
        System.out.println("modulo: " + 5 % 2);

//        Compound assignment
        x = x + 1;
        System.out.println(x);
        x *= 2;
        System.out.println(x);

//        Post-increment
        int y = x++;
//        Pre-increment
        int z = ++x;
        System.out.println("y=" + y + " z=" + z);

//        Logic operators
//        Equal
        System.out.println(z == 22);

//        Not equal
        System.out.println(z != 22);

//        Condition structure
        if (z == 22 || z < 22) {
            System.out.println("z is less and equal 22");
        } else if (z < 50) {
            System.out.println("z is greater than 22 and less than 50");
        } else {
            System.out.println("z is greater than 50");
        }
//        Multiple conditions
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Beer");
                break;
            case 'C':
                System.out.println("Coca-Cola");
                break;
            default:
                System.out.println("Not found");
        }

//        Numbers from 10 to n
        int n = Integer.parseInt(args[0]);
        int inc = 10;
        System.out.println("N has value: " + n);

        while (inc <= n){
            System.out.print(inc);
            System.out.print(" ");
            inc++;
        }
        System.out.println("\nNumber with final condition");
        inc = 10;
        do {
            System.out.print(inc);
            System.out.print(" ");
            inc++;
        } while (inc <= n);

        System.out.println("\nOne line while - for");
        for (int i = 10; i <= n; i++) {
            System.out.print(i);
            System.out.print(" ");
        }


    }
}
