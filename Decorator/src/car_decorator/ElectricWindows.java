package car_decorator;

import car_templates.BaseCar;

public class ElectricWindows extends AddonDecorator{

    public ElectricWindows(BaseCar newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", ElectricWindows";
    }

    @Override
    public double getCost() {
        return tempCar.getCost() + 200.0;
    }
}
