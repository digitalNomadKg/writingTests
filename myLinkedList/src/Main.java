import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Banker john = new Banker("", 0);

        john.setName("Timur");
        john.setcBalance(4000.0);
        System.out.println(john.getName() + " " + john.getcBalance());

        ArrayList<Integer> testingArrays = new ArrayList<>();
        testingArrays.add(5);
        testingArrays.add(6);
        testingArrays.add(7);

        for (int i = 0; i < testingArrays.size(); i++) {
            System.out.println(i + "--------" + testingArrays.get(i));
        }

        System.out.println("");
        System.out.println("Linkelist example below + Iterator:");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JS");
        linkedList.add("Swift");

        //iterators; pring out the values of linkedlist using iterator

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println("Your Language is :" + iterator.next());
        }

        //using for loop
        System.out.println("using for loop");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " is " + linkedList.get(i));
        }

      }
}
