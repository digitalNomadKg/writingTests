import java.util.Scanner;

public class TemperatureChanger {

    private void tempCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature: " + "F");
        double temp = scanner.nextInt();
        double resultInCelsius;

        resultInCelsius = ((temp - 32) * 5) / 9;
        System.out.println(temp +" F"+ " is equal to " + resultInCelsius + " Celsius");
    }


    public static void main(String[] args) {

        TemperatureChanger temperature = new TemperatureChanger();
        temperature.tempCalculation();

    }


}






