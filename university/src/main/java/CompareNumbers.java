import java.util.Scanner;

public class CompareNumbers {

    public void calculate() {

        double number, number2, result;
        String inputOperator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter num1");
        number = scanner.nextDouble();
        System.out.println("Please enter num2");
        number2 = scanner.nextDouble();
        System.out.println("Please input operator");
        inputOperator = scanner.next();


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
        compareNumbers.calculate();

    }
}
