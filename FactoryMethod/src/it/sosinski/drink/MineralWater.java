package it.sosinski.drink;

public class MineralWater implements Drink{

    @Override
    public String getProductName() {
        return "Mineral Water";
    }

    @Override
    public int getCaloriesPerPotion() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 1.20;
    }
}
