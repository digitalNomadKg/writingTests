public class Logical {

    private boolean b = true;
    private boolean c = false;
    private boolean d = false;

    public static void main(String[] args) {

        Logical logical = new Logical();

        System.out.println(logical.b && logical.c && logical.d);
        System.out.println(logical.b && logical.c);
        System.out.println(logical.b || logical.d || logical.c);
        System.out.println(!logical.c); // ! reverts to opposite/ change viceversa

    }
}
