import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    //listing numbers from 1 to 200
    //finding even number

    public void allNumbers() {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print((i) + ",even ");
            } else {
                System.out.println((i) + ",odd ");
            }
        }
        System.out.println();
        System.out.println("-------------------");

        for (int j = 500; j >= 1; j--) {
            System.out.print(j + ",");
        }
    }


    public void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Please choose number to check if it is Odd or Even?");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an Odd number");
        }

    }




    public static void main(String[] args) {

        Numbers numb = new Numbers();
        numb.allNumbers();
        numb.evenNumber();

    }
}
