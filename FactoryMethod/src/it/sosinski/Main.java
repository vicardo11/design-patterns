package it.sosinski;

import it.sosinski.factory.DrinkFactory;
import it.sosinski.drink.Drink;

public class Main {
    public static void main(String[] args) {

        DrinkFactory factory = new DrinkFactory();
        Drink milk = factory.getDrink("coke Zro");

        System.out.println("Product name: " + milk.getProductName());
        System.out.println("Calories: " + milk.getCaloriesPerPotion());
        System.out.println("Price: " + milk.getPrice());


    }
}
