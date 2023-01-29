import Boat.Ferry;
import Cars.*;
import org.junit.Test;

public class TestMovable {

    /**
     * Control if all movables can use move
     */
    @Test
    public void moveCar() {
        Volvo240 car = new Volvo240(0,0,0);
        car.startEngine();
        car.move();
        assert(car.getX == car.speedFactor() && car.getY == 0);
    }
    public void moveBoat() {
        Ferry ferry = new Ferry(0,0,0,0);
        ferry.move();
        ferry.startEngine();
        assert(ferry.getX == ferry.speedFactor());


    }

    /**
     * Control if all movables can use turnLeft
     */
    @Test
    public void turnLeftCar() {

    }
    @Test
    public void turnLeftBoat() {

    }
    /**
     * Control if all movables can use turnRight
     */
    @Test
    public void turnRightCar() {

    }
    @Test
    public void turnRightBoat() {

    }


    //@Test
    ///**
    // * Control if all movables can use incrementSpeed
    // */
    //@Test
    ///**
    // * Control if all movables can use decrementSpeed
    // */

}
