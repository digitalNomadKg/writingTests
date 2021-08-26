import java.util.Scanner;

public class Numbers {

    //listing numbers from 1 to 200
    //finding even number

    public void allNumbers() {
        for (int i = 0; i < 200; i++) {
            int num = i + 1;
            System.out.print(num + ",");
        }

        System.out.println("-------------------");

        for(int j=500; j>0; j--){
            int jb= j-1;
            System.out.print(jb + ",");
        }
    }


    public void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Please choose number to check if it is Odd or Even?");
        int evenNumber = scanner.nextInt();

        if (evenNumber % 2 == 0) {
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
