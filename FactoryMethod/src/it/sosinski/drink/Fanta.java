package it.sosinski.drink;

public class Fanta implements Drink{

    @Override
    public String getProductName() {
        return "Fanta";
    }

    @Override
    public int getCaloriesPerPotion() {
        return 135;
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
