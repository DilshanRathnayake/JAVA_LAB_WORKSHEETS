package LW_04.Q5;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String Entree;
        String Side_Dish;
        String Drink;

        System.out.println("Entree                  Side Dish               Drink");
        System.out.println("Tofu Burger     $3.49   Rice Cracker    $0.79   Cafe Mocha  $1.99");
        System.out.println("Cajun Chicken   $4.59   No-Salt Fries   $0.69   Cafe Latte  $1.90");
        System.out.println("Buffalo Wings   $3.99   Zucchini        $1.09   Espresso    $2.49");
        System.out.println("Rainbow Fillet  $2.99   Brown Rice      $0.59   Oolong      $0.99");

        System.out.println("Enter the name of the Entree : ");
        Entree = scanner.nextLine();
        System.out.println("Enter the name of the Side Dish : ");
        Side_Dish = scanner.nextLine();
        System.out.println("Enter the name of the Drink : ");
        Drink = scanner.nextLine();

        double Entree_price = 0;
        double Side_dish_price = 0;
        double Drink_price = 0;

        if(Objects.equals(Entree, "Tofu Burger")){
            Entree_price = 3.49;

        }else  if(Objects.equals(Entree, "Cajun Chicken")){
            Entree_price = 4.59;

        }else  if(Objects.equals(Entree, "Buffalo Wings")){
            Entree_price = 3.99;

        }else  if(Objects.equals(Entree, "Rainbow Fillet")){
            Entree_price = 2.99;

        }else{
            System.out.println("Invalid Entry");
        }


        if(Objects.equals(Side_Dish, "Rice Cracker")){
            Side_dish_price = 0.79;

        }else if(Objects.equals(Side_Dish, "No-Salt Fries")){
            Side_dish_price = 0.69;

        }else  if(Objects.equals(Side_Dish, "Zucchini")){
            Side_dish_price = 1.09;

        }else  if(Objects.equals(Side_Dish, "Brown Rice")){
            Side_dish_price = 0.59;

        }else{
            System.out.println("Invalid Entry");
        }


        if(Objects.equals(Drink, "Cafe Mocha")){
            Drink_price = 1.99;

        }else  if(Objects.equals(Drink, "Cafe Latte")){
            Drink_price = 1.90;

        }
        else  if(Objects.equals(Drink, "Espresso")){
            Drink_price = 2.49;

        }else  if(Objects.equals(Drink, "Oolong")){
            Drink_price = 0.99;

        }else{
            System.out.println("Invalid Entry");
        }

        double Full_price = 0;


        Full_price = Entree_price + Side_dish_price + Drink_price;


        System.out.println("Total price is : " + Full_price);


    }
}
