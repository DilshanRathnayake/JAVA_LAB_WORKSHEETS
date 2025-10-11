package LW_03.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Temperature temp = Temperature.fromFahrenheit(inputFahrenheit);

        System.out.println("Temperature in Celsius: " + temp.toCelsius());

        scanner.close();
    }
}
