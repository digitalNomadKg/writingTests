import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareString {


    public void inputString() {

        List<String> nameString = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter phrase to save");

        String input = scanner.nextLine();

        nameString.add(input);
        System.out.println(nameString);
        System.out.println("Please add one more phrase");
        input = scanner.nextLine();
        nameString.add(input);
        System.out.println(nameString);
    }


    public static void main(String[] args) {

        CompareString compareString = new CompareString();
        compareString.inputString();

    }
}
