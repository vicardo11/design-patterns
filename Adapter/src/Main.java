import sensor.Thermostat;
import temperature.TemperatureKelvinAdapterImpl;

public class Main {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat(30.0);

        TemperatureKelvinAdapterImpl adapter = new TemperatureKelvinAdapterImpl(thermostat);

        System.out.println(adapter.getTemperature());
    }
}
