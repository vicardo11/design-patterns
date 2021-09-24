package car_templates;

public class AudiA6 implements BaseCar{

    @Override
    public String getDescription() {
        return "Audi A6";
    }

    @Override
    public double getCost() {
        return 38_500.0;
    }
}
