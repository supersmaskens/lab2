package Cars;

import Transport.*;

import java.awt.*;

public abstract class PassengerCar extends Car implements Transportable{
    public PassengerCar(int nrDoors, Color color, double enginePower, String name, double xPosition, double yPosition, double direction) {
        super(nrDoors, color, enginePower, name, xPosition, yPosition, direction);
    }
}
