package model;

public class Car extends Vehicle{

    private int numberOfDoor;

    @Override
    public Vehicle clone() {
        Car car = new Car();
        car.setColor(this.color);
        car.setEngineCapacity(this.engineCapacity);
        car.setHorsePower(this.horsePower);
        car.setNumberOfDoor(this.numberOfDoor);

        return car;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoor=" + numberOfDoor +
                ", horsePower=" + horsePower +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
