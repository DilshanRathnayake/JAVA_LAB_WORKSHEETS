package LW_04.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("The year is a leap yaer");
        }else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("The year is a leap year");
        }else{
            System.out.println("The year is not a leap year");
        }

    }
}
