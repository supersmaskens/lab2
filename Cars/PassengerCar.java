package Cars;

import Transport.*;

import java.awt.*;

public abstract class PassengerCar extends Car implements Transportable{
    private boolean isTransported;
    public PassengerCar(int nrDoors, Color color, double enginePower, String name, double xPosition, double yPosition, double direction) {
        super(nrDoors, color, enginePower, name, xPosition, yPosition, direction);
        isTransported = false;
    }
    public boolean beingTransported(){
        return isTransported;
    }
    public boolean beTransported(){
        isTransported = !isTransported;
        return isTransported;
    }


}
