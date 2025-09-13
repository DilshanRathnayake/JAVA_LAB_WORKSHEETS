package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centimeter;
        double inches;
        int feet;


        System.out.println("Enter from centimeter: ");
        centimeter = scanner.nextFloat();

        inches = centimeter / 2.54;
        feet = (int)(inches / 12);
        inches = inches - (feet * 12);

        System.out.println(feet + " feet " + inches + " inch ");


    }

}
