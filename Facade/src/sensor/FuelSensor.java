package sensor;

public class FuelSensor implements FluidSensor{

    private int percentOfFilling;

    public FuelSensor(int percentOfFilling) {
        if (percentOfFilling <= 0) {
            this.percentOfFilling = 0;
        } else if (percentOfFilling > 100) {
            this.percentOfFilling = 100;
        } else {
            this.percentOfFilling = percentOfFilling;
        }
    }

    @Override
    public boolean isFilled() {
        return percentOfFilling >= 5;
    }
}
