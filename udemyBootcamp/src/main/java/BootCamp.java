public class BootCamp {

    public void cal() {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.println(num1);
        System.out.println(num2++);
        System.out.println(++num3);
        System.out.println("-----------");
        System.out.println(num1);
        System.out.println(num1--);
        System.out.println(--num1);

    }


    public static void main(String[] args) {
        BootCamp bootCamp = new BootCamp();

        bootCamp.cal();

    }


}
