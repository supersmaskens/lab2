import Cars.*;
import org.junit.Test;
import Transport.*;
import java.awt.*;
import Boat.*;

public class TestBoat {
    /**
     * Load and unload Ferry
     */
    @Test
    public void loadFerry() {
        Ferry<PassengerCar> ferry = new Ferry();
        Volvo240 car = new Volvo240();
        ferry.load(car);
        assert(ferry.contains(car));
    }
    @Test
    public void unloadFerry() {
        Ferry<PassengerCar> ferry = new Ferry();
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();
        ferry.load(saab);
        ferry.load(volvo);
        ferry.unload();
        assert(ferry.contains(volvo) && !ferry.contains(saab));
    }
    @Test
    public void unloadEmptyFerry() {
        Ferry ferry = new Ferry();
        ferry.unload();
        assert(ferry.isEmpty()); // Maybe have a isEmpty method in ferry?
    }
    @Test
    public void loadFullFerry() {
        Ferry ferry = new Ferry(0,0,0,0);
        ferry.load(maxAmountOfCars); // Not sure how to accomplish this.
        Car car = new Volvo240();
        ferry.load(car);
        assert(!ferry.contains(car));
    }
    @Test
    public void loadTruck() {
        Ferry ferry = new Ferry(0,0,0,0);
        Car truck = new ScaniaTruck();
        ferry.load(truck); // should give error i suppose?
    }
}
