package test;
import Cars.*;
import org.junit.Test;
import Boat.*;

public class TestBoat {
    /**
     * Load and unload Ferry
     */
    @Test
    public void loadFerry() {
        Ferry<PassengerCar> ferry = new Ferry<PassengerCar>();
        Volvo240 car = new Volvo240();
        ferry.loadableOn();
        ferry.load(car);
        assert(ferry.contains(car));
    }
    @Test
    public void unloadFerry() {
        Ferry<PassengerCar> ferry = new Ferry<PassengerCar>();
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();
        ferry.loadableOn();
        ferry.load(saab);
        ferry.load(volvo);
        ferry.unload();
        assert(ferry.contains(volvo) && !ferry.contains(saab));
    }
    @Test
    public void unloadEmptyFerry() {
        Ferry<PassengerCar> ferry = new Ferry<PassengerCar>();
        ferry.unload();
        assert(ferry.isEmpty());
    }
    @Test
    public void loadFullFerry() {
        Ferry<PassengerCar> ferry = new Ferry<PassengerCar>(0,0,0,0);
        Volvo240 car = new Volvo240();
        ferry.load(car);
        assert(!ferry.contains(car));
    }
    /*
    @Test
    public void loadTruck() {
        Ferry<PassengerCar> ferry = new Ferry(0,0,0,0);
        Scania truck = new Scania();
        ferry.load(truck); // Gives static error as it should.
    } */
}
