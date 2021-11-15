package model;

public class Boat extends Vehicle{

    private int numberOfSeats;

    @Override
    public Vehicle clone() {
        Boat boat = new Boat();
        boat.setColor(this.color);
        boat.setNumberOfSeats(this.numberOfSeats);
        boat.setEngineCapacity(this.engineCapacity);
        boat.setHorsePower(this.horsePower);

        return boat;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "numberOfSeats=" + numberOfSeats +
                ", horsePower=" + horsePower +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
