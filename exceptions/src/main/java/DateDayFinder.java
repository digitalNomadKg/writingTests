import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDayFinder {


    public static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter date: (1-31)");
        int dd = scanner.nextInt();
        System.out.println("Enter month: (1-12)");
        int mm = scanner.nextInt()-1;
        System.out.println("Enter year: ");
        int yy = scanner.nextInt();

        Date date = new GregorianCalendar(yy,mm,dd).getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String day = simpleDateFormat.format(date);
        System.out.println(day);


    }
}
