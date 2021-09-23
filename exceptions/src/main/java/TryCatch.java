public class TryCatch {

    public static void main(String[] args) {

        try {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Check index value: " + e);
        }


        System.out.println("the program is still working");
    }
 }
