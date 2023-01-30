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
        Ferry<PassengerCar> ferry = new Ferry(0,0,0,0);
        Volvo240 car = new Volvo240();
        ferry.load(car);
        assert(ferry.contains(car));
    }
    @Test
    public void unloadFerry() {
        Ferry<PassengerCar> ferry = new Ferry(0,0,0,0);
        Car car = new Volvo240();
        Car car1 = new Saab95();
        ferry.load(car);
        ferry.load(car1);
        ferry.unload();
        assert(ferry.contains(car1) && !ferry.contains(car));
    }
    @Test
    public void unloadEmptyFerry() {
        Ferry ferry = new Ferry(0,0,0,0);
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
