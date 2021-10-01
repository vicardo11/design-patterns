import model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .capacity(2.00)
                .manufacturer("Audi")
                .model("A6")
                .build();

        System.out.println(car);
    }
}
