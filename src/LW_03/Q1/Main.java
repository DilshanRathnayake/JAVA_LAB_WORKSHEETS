package LW_03.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter temperature in celsius: ");
        double inputCelsius = scanner.nextDouble();

        Temperature temp = new Temperature(inputCelsius);

        System.out.println("Temperature in fahrenheit : " + temp.toFahrenheit());

        scanner.close();



    }
}
