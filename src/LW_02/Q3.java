package LW_02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;

        System.out.println("Enter the number of the rows in pyramid: ");
        rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++){

                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }



            System.out.println();
        }

    scanner.close();

    }
}
