import java.util.Scanner;

public class CreatingPattern {

    Scanner sc = new Scanner(System.in);


    public void starTree() {
        int input = sc.nextInt();
        System.out.println();
        System.out.println("Happy New year");

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


        if ((input >= 3)) {
            for (int k = 1; k <= 3; k++) {
                System.out.print("*");
            }
        }

        System.out.println("");

        for (int l = input; l >= 1; l--) {
            for (int m = 0; m < l; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void generateRandomNumber() {
        for (int r = 1; r <=6; r++) {
            System.out.println((int) (Math.random()* 50));
        }
    }


    public static void main(String[] args) {
        CreatingPattern pattern = new CreatingPattern();

        pattern.starTree();
        pattern.generateRandomNumber();
    }
}
