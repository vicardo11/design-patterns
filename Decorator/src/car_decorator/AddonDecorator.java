package car_decorator;

import car_templates.BaseCar;

public abstract class AddonDecorator implements BaseCar {

    public BaseCar tempCar;

    public AddonDecorator(BaseCar newCar) {
        tempCar = newCar;
    }

    public String getDescription() {
        return tempCar.getDescription();
    }

    public double getCost() {
        return tempCar.getCost();
    }
}
