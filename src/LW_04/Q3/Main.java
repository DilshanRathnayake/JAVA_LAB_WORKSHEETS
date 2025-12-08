package LW_04.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("6.Million");
        System.out.println("9.Billion");
        System.out.println("12.Trillion");
        System.out.println("15.Quadrillion");
        System.out.println("18.Quintillion");
        System.out.println("21.Sextillion");
        System.out.println("30.Nonillion");
        System.out.println("100.Googol");

        System.out.println("Enter the power of the 10 :");
        int power = scanner.nextInt();

        switch (power) {
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Googol");
                break;
            default:
                System.out.println("Invalid Power");
        }


    }
}
