package sensor;

public class OilSensor implements FluidSensor{

    private int percentOfFilling;

    public OilSensor(int percentOfFilling) {
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
        return percentOfFilling >= 60;
    }
}
