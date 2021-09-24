package car_templates;

public class AudiA8 implements BaseCar{

    @Override
    public String getDescription() {
        return "Audi A8";
    }

    @Override
    public double getCost() {
        return 35_000.0;
    }
}
