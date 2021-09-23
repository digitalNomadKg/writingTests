import java.util.Scanner;

public class BankMain {

    private static Scanner scanner = new Scanner(System.in);
    private static User user1 = new User("", " ", 0, 0, 0);
    private static Command command = new Command();

    public static void main(String[] args) {

        command.printCommand();


        user1.setFirstName("First name : " + scanner.nextLine().toUpperCase());
        System.out.println(user1.getFirstName());

    }

}
