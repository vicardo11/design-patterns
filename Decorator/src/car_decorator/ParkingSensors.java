package car_decorator;

import car_templates.BaseCar;

public class ParkingSensors extends AddonDecorator{

    public ParkingSensors(BaseCar newCar) {
        super(newCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ParkingSensors";
    }

    @Override
    public double getCost() {
        return super.getCost() + 200.0;
    }
}
