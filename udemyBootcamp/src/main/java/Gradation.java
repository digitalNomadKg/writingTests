import java.util.Scanner;

public class Gradation {


    public void mark() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your mark: 1-5");

        int in = scanner.nextInt();


        while (in > 5) {
            System.out.println("Check the mark, mark is not valid");
            in = scanner.nextInt();
        }
        switch (in) {
            case 1:
                System.out.println("Your mark is " + in);
                break;
            case 2:
                System.out.println("Your mark is " + in);
                break;
            case 3:
                System.out.println("Your mark is " + in + " not 5 but OK");
                break;
            case 4:
                System.out.println("Your mark is " + in);
                break;
            default:
                System.out.println("Well done, deserved " + in);
        }
    }

    public static void main(String[] args) {
        Gradation g = new Gradation();
        g.mark();
    }
}
