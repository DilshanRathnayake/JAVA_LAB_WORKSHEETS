package LW_04.Q8;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number for 'N' : ");
        int N = scanner.nextInt();

        for (int i = 1;  i <= 10; i++){
            System.out.println(N + " " + " * " + i + " = " + N*i);
        }

    }
}
