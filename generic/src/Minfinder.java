public class Minfinder {

    public static <T extends Comparable<T>> T mini(T a, T b, T c) {
        T mini = a;

        if (b.compareTo(mini) <0) {
            mini = b;
        }
        if (c.compareTo(mini) <0) {
            mini = c;
        }

        return mini;
    }


    public static void main(String[] args) {

        System.out.printf("Min of %f, %f, %f, is: %f", 1.5, 0.5, 0.1, mini(1.5, 0.5, 0.25));

    }
}
