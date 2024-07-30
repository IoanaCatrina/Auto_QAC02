package homeworks.java.intro;

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 3) {
            float firstNumber = Float.parseFloat(args[0]);
            float secondNumber = Float.parseFloat(args[2]);
            String operator = args[1];
            float result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "%":
                    result = firstNumber % secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Invalid input");

            }
            System.out.println("Result is: " + result);
        } else {
            System.err.println("3 arguments are needed!");
        }

    }
}
