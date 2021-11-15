package model;

public abstract class Vehicle {

    protected int horsePower;
    protected double engineCapacity;
    protected String color;

    public abstract Vehicle clone();

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "horsePower=" + horsePower +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
