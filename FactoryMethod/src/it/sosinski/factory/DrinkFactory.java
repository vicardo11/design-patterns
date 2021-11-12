package it.sosinski.factory;

import it.sosinski.drink.*;

import static it.sosinski.factory.DrinkConstants.*;

public class DrinkFactory {

    public Drink getDrink(String drinkType) {

        drinkType = drinkType.toLowerCase();

        switch (drinkType) {
            case MILK:
                return new Milk();
            case COKE_ZERO:
                return new CokeZero();
            case MINERAL_WATER:
                return new MineralWater();
            default:
                return new Fanta();
        }
    }
}