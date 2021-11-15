package temperature;

public class TemperatureKelvinAdapterImpl implements TemperatureKelvinAdapter {

    private TemperatureCelsius sensor;

    public TemperatureKelvinAdapterImpl(TemperatureCelsius sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        return sensor.getTemperature() + 273.15;
    }
}
