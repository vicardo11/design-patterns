package car_templates;

public class AudiTT implements BaseCar{

    @Override
    public String getDescription() {
        return "Audi TT";
    }

    @Override
    public double getCost() {
        return 40_000.0;
    }
}
