import java.util.Scanner;

public class CompareNumbers {

    public void compare() {

        double number, number2, result;
        String inputOperator;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter num1");
        number = scanner.nextDouble();
        System.out.println("Please enter num2");
        number2 = scanner.nextDouble();
        System.out.println("Please input operator");
        inputOperator = scanner.next();


        while (number == 0 || number2 == 0) {
            System.out.println("Entered number can't be a ZERO");
            number = scanner.nextDouble();
            break;
        }

        switch (inputOperator) {
            case "+":
                result = number + number2;
                System.out.println(result);
                break;
            case "-":
                result = number - number2;
                System.out.println(result);
                break;
            case "*":
                result = number * number2;
                System.out.println(result);
                break;

            case "/":
                result = number / number2;
                System.out.println(result);
                break;

            default:
                System.out.println("Sorry next time, you lost your chance");
        }
    }

    public static void main(String[] args) {

        CompareNumbers compareNumbers = new CompareNumbers();
        compareNumbers.compare();

    }
}
