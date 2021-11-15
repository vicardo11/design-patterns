package sensor;

public class TemperatureSensor {

    private double temperature;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    public boolean isCold() {
        return temperature <= 15.0;
    }
}
