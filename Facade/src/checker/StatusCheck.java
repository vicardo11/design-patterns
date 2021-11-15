package checker;

import sensor.FuelSensor;
import sensor.OilSensor;
import sensor.TemperatureSensor;

public class StatusCheck {

    private FuelSensor fuelSensor = new FuelSensor(65);
    private OilSensor oilSensor = new OilSensor(65);
    private TemperatureSensor temperatureSensor = new TemperatureSensor(12);

    public void checkEngineStatus() {
        boolean fuel = fuelSensor.isFilled();
        boolean oil = oilSensor.isFilled();
        boolean temp = temperatureSensor.isCold();

        if (fuel && oil && temp) {
            System.out.println("Your engine is ready to start");
        } else {
            System.out.println("You have some problems with engine. Contact with service.");
        }
    }
}
