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
        isTransported = true;
        return true;
    }
    public boolean unTransport(){
        isTransported = false;
        return false;
    }
    public void move() {
        if(!isTransported) {
            setX(Math.cos(getDirection()) * getCurrentSpeed());
            setY(-Math.sin(getDirection()) * getCurrentSpeed());
        }
    }
    public void turnLeft(){
        if(!isTransported) {
            setDirection((getDirection() + (Math.PI / 180)) % (Math.PI * 2));
        }
    }
    public void turnRight(){
        if(!isTransported) {
            setDirection((getDirection() - (Math.PI / 180)) % (Math.PI * 2));
        }
    }

}
