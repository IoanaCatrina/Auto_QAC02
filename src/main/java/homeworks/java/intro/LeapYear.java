package homeworks.java.intro;

public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        if (year < 1900 || year > 2016) {
            System.out.println("The year should be between 1900 - 2016!");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("February " + year + " has 29 days");
            } else {
                System.out.println("February " + year + " has 28 days");
            }
        }
    }
}

