import java.util.ArrayList;

public class ToDoListFunction {


    final ArrayList<String> todoList = new ArrayList<>();

    //add list item

    public void addItem(String item) {
        todoList.add(item);
    }

    //remove item

    public void removeItem(int index) {
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    //print entire list

    public void printTodolist() {
        System.out.println("Todo list contains of " + todoList.size() + "items");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("Item at position " + (i + 1) + " is " + todoList.get(i));
        }
    }

    //update list
    public void updateTodo(int index, String list) {
        todoList.set(index, list);
        System.out.println(index + 1);
    }

    //search

    public String searchItem(String searchItem) {
        int index = todoList.indexOf(searchItem);
        if (index == -1) {
            return null;
        } else {
            return todoList.get(index);
        }
    }

}


