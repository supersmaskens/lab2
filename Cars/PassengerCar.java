package Cars;

import Cars.Car;

import java.awt.*;

public abstract class PassengerCar extends Car {
    public PassengerCar(int nrDoors, Color color, double enginePower, String name, double xPosition, double yPosition, double direction) {
        super(nrDoors, color, enginePower, name, xPosition, yPosition, direction);
    }
}
