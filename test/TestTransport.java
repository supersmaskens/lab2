package test;
import Boat.*;
import Cars.*;
import Transport.*;
import org.junit.Test;

public class TestTransport {
    @Test
    public void cantMoveWhileTransported() {
        Workshop<Volvo240> ws = new Workshop<>(32);
        Volvo240 car = new Volvo240();
        ws.loadableOn();
        ws.load(car);
        car.gas(1);
        car.move();
        assert(car.getX() == 0);
    }
    @Test
    public void transportMove() {
        CarTransport<PassengerCar> bt = new CarTransport<>();
        Saab95 car = new Saab95();
        bt.lowerRamp();
        bt.load(car);
        bt.raiseRamp();
        bt.gas(1);
        bt.move();
        bt.brake(1);
        bt.lowerRamp();
        bt.unload();
        assert(car.getX() == bt.getX() - 5 * bt.getDirection());
    }
}
