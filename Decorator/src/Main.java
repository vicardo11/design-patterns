import car_decorator.DarkWindows;
import car_decorator.ElectricWindows;
import car_decorator.ParkingSensors;
import car_templates.AudiA6;
import car_templates.BaseCar;

public class Main {
    public static void main(String[] args) {

        BaseCar basicCar = new ElectricWindows(new DarkWindows(new ParkingSensors(new AudiA6())));

        System.out.println("Car: " + basicCar.getDescription());
        System.out.println("Cost: " + basicCar.getCost());
    }
}
