package LW_02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int[] number = new int[5];
        int Hight;
        int secondHight;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + " number: ");
            number[i] = scanner.nextInt();

        }

        Hight = number[0];
        secondHight = 0;

        for (int j = 1; j < 5; j++){

             if( number[j] > Hight){
                 secondHight = Hight;
                 Hight = number[j];

             }else{
                 if(secondHight < number[j]){
                     secondHight = number[j];
                 }

             }

        }


        System.out.println("The second hight number is: " + secondHight);


    }

}
