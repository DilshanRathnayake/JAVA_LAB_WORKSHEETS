package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentences what you want to check is it palindromes or not? :  ");
        String sentence = scanner.nextLine();


        StringTokenizer tokenizer = new StringTokenizer(sentence, " .,!?;:\"'()[]{}-");

        StringBuilder cleaned = new StringBuilder();

        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            cleaned.append(word);
        }

        String text = cleaned.toString().toLowerCase();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(reversed);


        if (text.equals(reversed)){
            System.out.println("This is a palindrome.");
        }else{
            System.out.println("This is not a palindrome.");
        }




    }
}
