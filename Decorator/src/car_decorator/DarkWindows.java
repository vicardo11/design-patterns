package car_decorator;

import car_templates.BaseCar;

public class DarkWindows extends AddonDecorator{

    public DarkWindows(BaseCar newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", DarkWindows";
    }

    @Override
    public double getCost() {
        return tempCar.getCost() + 1000.0;
    }
}
