package LW_04.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = scanner.nextInt();

        int largest;

        if(num1 > num2){
            if(num1 > num3){
                largest = num1;
            }else{
                largest = num3;
            }
        }else{
            if(num2 >num3){
                largest = num2;
            }else{
                largest = num3;
            }
        }


        System.out.println("Largest number is " + largest);


    }
}
