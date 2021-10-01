public class StringFinder {


    public static <T extends Comparable<T>> T stringFinder(T s, T q, T l) {
        T stringFinder = s;

        if (q.compareTo(stringFinder) > 0) {
            stringFinder = q;
        }
        if (l.compareTo(stringFinder) > 0) {
            stringFinder = l;
        }
        return stringFinder;
    }


    public static void main(String[] args) {

        System.out.printf("Max is %s", stringFinder("NewIdeAcomesFrom", "Hippopotamus", "HelloCHkaksjdkrazyWorld"));

    }

}




