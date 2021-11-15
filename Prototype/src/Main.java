import model.Boat;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat();

        boat.setHorsePower(10);
        boat.setNumberOfSeats(4);

        Boat boatClone = (Boat) boat.clone();

        System.out.println(boat + "\n");
        System.out.println(boatClone);
    }
}
