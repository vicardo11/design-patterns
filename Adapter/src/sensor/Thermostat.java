package sensor;

import temperature.TemperatureCelsius;

public class Thermostat implements TemperatureCelsius {

    private double temperature;

    public Thermostat(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
