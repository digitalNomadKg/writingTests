import java.util.Scanner;

public class LeapYear {


    Scanner sc = new Scanner(System.in);

    public void checkLeapYear() {
        System.out.print("Please enter year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " It is a Leap Year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }


    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        leapYear.checkLeapYear();
    }
}
