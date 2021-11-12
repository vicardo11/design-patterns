package it.sosinski.drink;

public class CokeZero implements Drink{

    @Override
    public String getProductName() {
        return "Coke Zero";
    }

    @Override
    public int getCaloriesPerPotion() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 3.70;
    }
}
