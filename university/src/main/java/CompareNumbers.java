import java.util.Scanner;

public class CompareNumbers {

    public void compare() {

        double number, number2, number3, result;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter num1");
        number = scanner.nextDouble();
        System.out.println("Please enter num2");
        number2 = scanner.nextDouble();
        System.out.println("Please enter num3");
        number3 = scanner.nextDouble();


        while (number == 0 || number2 == 0 || number3 == 0) {
            System.out.println("Num can't be equal to 0. Please enter number");
            number = scanner.nextDouble();

            result = number + number2 + number3;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {

        CompareNumbers compareNumbers = new CompareNumbers();

        compareNumbers.compare();

    }
}
