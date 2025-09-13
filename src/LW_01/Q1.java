package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Enter your word: ");
        name = scanner.nextLine();

        if (name.length() % 2 == 1){
            System.out.println(name.substring(name.length()/2,(name.length()/2 + 1)));
        }


    }
}
