package it.sosinski.drink;

public class Milk implements Drink{

    @Override
    public String getProductName() {
        return "Milk";
    }

    @Override
    public int getCaloriesPerPotion() {
        return 150;
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
}
