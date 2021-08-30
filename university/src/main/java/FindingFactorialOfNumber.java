import java.util.Scanner;

public class FindingFactorialOfNumber {

    Scanner sc = new Scanner(System.in);

    private void inputNumber() {
        System.out.println("Please choose number to see it factorial");
        int num = 1;

        int factor = sc.nextInt();

        while (factor == 0) {
            System.out.println("You can't choose 'ZERO': ");
            factor = sc.nextInt();
        }


        for (int i = 1; i <= factor; i++) {
            num *= i;
        }

        System.out.println("!" + factor + " is equal to: " + num);

    }
    //!n= n*(n-1)*(n*2)*...*1

    public static void main(String[] args) {
        FindingFactorialOfNumber findingFactorialOfNumber = new FindingFactorialOfNumber();

        findingFactorialOfNumber.inputNumber();
    }
}
