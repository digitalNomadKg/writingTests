package arrayListAdvanced;

import java.util.ArrayList;

public class ArrayListadv {

    private static void simpleTask() {
        String str = "123";
        int i = str.length();
        int j = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(j);
    }


    private static void arrayListTask() {

        ArrayList<Integer> advArrList = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            advArrList.add(Integer.valueOf(i) + 1); //Autoboxing
            System.out.println(advArrList);

            System.out.println("The value is: " + advArrList.get(i).intValue());
        }

    }


    public static void main(String[] args) {
        simpleTask();

        arrayListTask();

    }
}
