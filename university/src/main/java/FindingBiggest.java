import java.util.Random;
import java.util.Scanner;

public class FindingBiggest {

    private void findNumber() {

        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        num1 = sc.nextInt();
        System.out.println("Please enter number 2");
        num2 = sc.nextInt();
        System.out.println("Please enter number 3");
        num3 = sc.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1 + " is less than " + num2 + " and " + num3);
        }
        if (num1 > num2 && (num1 > num3)) {
            System.out.println(num1 + " is bigger than " + num2 + " and " + num3);
        }
        if (num1 == num2 && num1 == num3) {
            System.out.println(num1 + " is equal to " + num2 + " and " + num3);
        }

        if ((num2 < num1) && (num2 < num3)) {
            System.out.println(num2 + " is less than " + num1 + " and " + num3);
        }
        if (num2 > num1 && (num2 > num3)) {
            System.out.println(num2 + " is bigger than " + num1 + " and " + num3);
        }
        if (num2 == num1 && num2 == num3) {
            System.out.println(num2 + " is equal to " + num1 + " and " + num3);
        }

        if ((num3 < num1) && (num3 < num2)) {
            System.out.println(num3 + " is less than " + num1 + " and " + num2);
        }
        if (num3 > num1 && (num3 > num2)) {
            System.out.println(num3 + " is bigger than " + num1 + " and " + num2);
        }
        if (num3 == num1 && num3 == num2) {
            System.out.println(num2 + " is equal to " + num1 + " and " + num3);
        }
    }


    private void randomNumber() {
        Random r = new Random();
        int nomer = r.nextInt(6) + 1;
        System.out.println(nomer);
    }


    public static void main(String[] args) {
        FindingBiggest find = new FindingBiggest();

        find.findNumber();
        find.randomNumber();
    }
}


