package LW_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;


        do{
            System.out.println("Enter a integer number: ");
            number = scanner.nextInt();

            if (number < 0 )break;

            String cals = String.valueOf(number);

            System.out.println("Digits in number: " +  cals.length());

        }while (true);
    }



}
