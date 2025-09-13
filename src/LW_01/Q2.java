package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;

        System.out.println("Enter your full name: ");
        firstName = scanner.next();
        middleName = scanner.next();
        lastName = scanner.next();

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");

    }

}
