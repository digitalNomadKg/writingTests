import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoListFunction toDoListFunction = new ToDoListFunction();


    public static void main(String[] args) {

        int command = 0;
        boolean exit = false;
        printCommand();

        while (!exit) {
            System.out.println("Enter your command: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0:
                    printCommand();
                    break;
                case 1:
                    toDoListFunction.printTodolist();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Please choose from given command");
            }
        }
    }

    private static void searchItem() {
        System.out.println("Enter String to be searched: ");
        String searchItem = scanner.nextLine();

        if (toDoListFunction.searchItem(searchItem) == null) {
            System.out.println("Item not found in your TODO list");
        } else {
            System.out.println(searchItem + " was found in your list");
        }

    }

    private static void removeItem() {
        System.out.println("Please choose item number to be deleted: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        toDoListFunction.removeItem(index - 1);
    }

    private static void updateItem() {
        System.out.println("Enter the item number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item to be added: ");
        String newItem = scanner.nextLine();
        toDoListFunction.updateTodo(index - 1, newItem);
    }

    private static void addItem() {
        System.out.println(" Enter item to be added in todo list: ");
        toDoListFunction.addItem(scanner.nextLine());
    }

    public static void printCommand() {
        System.out.println("\n Commands " +
                "\n Press 0 : To print instructions" +
                "\n Press 1 : To print all list" +
                "\n Press 2 : To add list in ToDo" +
                "\n Press 3 : To modify item in Todo" +
                "\n Press 4 : To remove  item from ToDo" +
                "\n Press 5 : To search an item from ToDo" +
                "\n Press 6 : To exit the app"
        );
    }
}
