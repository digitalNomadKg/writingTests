import java.util.ArrayList;

public class Command {


    final ArrayList<String> userList = new ArrayList<String>();



    public void addUserName() {

    }


    public static void printCommand() {
        System.out.println("\n Commands " +
                "\n Press 1 : To print user details" +
                "\n Press 2 : To add amount" +
                "\n Press 3 : To modify user" +
                "\n Press 4 : To withdraw amount" +
                "\n Press 6 : To exit the app"
        );
    }

}
