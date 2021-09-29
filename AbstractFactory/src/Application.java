import factory.AbstractBedroomFactory;
import factory.ModernBedroomFactory;
import furnitures.beds.Bed;

public class Application {

    public static void main(String[] args) {
        AbstractBedroomFactory factory = new ModernBedroomFactory();
        Bed bed = factory.buildBed();

        bed.make();
    }
}
