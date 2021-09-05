import java.util.Scanner;

public class TestingArrays {


    private void getArray() {

        int[] setArray = {1, 3, 4, 5, 6, 720, 19, 43, 6, 8, 450, 53};
        for (int a = 0; a < setArray.length; a++) {
            System.out.println(setArray[a] + " ");
        }

        int largestNumber = setArray[0];
        for (int i = 1; i < setArray.length; i++) {
            if (setArray[i] > largestNumber) {
                largestNumber = setArray[i];
            }
        }
        System.out.println("the largest number is: " + largestNumber);

        int smallestNumber = setArray[0];
        for (int s = 1; s > setArray.length; s--) {
            if (setArray[s] > smallestNumber) {
                smallestNumber = setArray[s];

            }
        }
        System.out.println("the smallest number is: " + smallestNumber);

        int sum = 0;
        for (int i = 0; i < setArray.length; i++) {
            sum += setArray[i];

        }
        System.out.println(sum);


        System.out.println("The length of the array: " + setArray.length);
    }

    private void compareNumbers() {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num1:");
        num1 = scanner.nextInt();
        System.out.println("Please enter num2");
        num2 = scanner.nextInt();

        int minNUmber;
        if (num1 > num2) {
            minNUmber = num2;
            System.out.println(minNUmber);
        } else {
            minNUmber = num1;
            System.out.println("The minimum number is " +minNUmber);
        }
    }


    public static void main(String[] args) {
        TestingArrays testingArrays = new TestingArrays();

        testingArrays.getArray();
        testingArrays.compareNumbers();

    }

}
