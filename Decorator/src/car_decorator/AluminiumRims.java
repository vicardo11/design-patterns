package car_decorator;

import car_templates.BaseCar;

public class AluminiumRims extends AddonDecorator{

    public AluminiumRims(BaseCar newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return tempCar.getDescription() + ", AluminiumRims";
    }

    @Override
    public double getCost() {
        return tempCar.getCost() + 700.0;
    }
}
