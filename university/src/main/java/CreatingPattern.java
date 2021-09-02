import java.util.Scanner;

public class CreatingPattern {

    Scanner sc = new Scanner(System.in);

    public void starTree() {
        System.out.println("Please choose number form 0 to 10");
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


    public static void main(String[] args) {
        CreatingPattern pattern = new CreatingPattern();

        pattern.starTree();
    }
}
