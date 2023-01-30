package Cars;

import Transport.*;


import java.awt.*;

public class CarTransport<T extends Transportable> extends Car implements Transporter<T> {
    private final Transporter_Helper<T> transporter;

    private boolean rampDown;

    public CarTransport(int nrDoors, Color color, double enginePower, String name,
                        double xPosition, double yPosition, double direction, int capacity) {
        super(nrDoors, color, enginePower, name, xPosition, yPosition, direction);
        transporter = new Transporter_Helper<T>(capacity);
        rampDown = false;
        transporter.loadableOff();
    }
    public CarTransport(double xPosition, double yPosition, double direction,
                        int capacity) {
        this(2, Color.red, 125, "Biltransport",
                xPosition, yPosition, direction, capacity);
    }
    public CarTransport() {
        this(2, Color.red, 100, "Biltransport"
        , 0, 0, 0, 32);
    }
    public boolean load(T t) {
        return transporter.load(t);
    }
    public boolean unload() {
        if (!rampDown) return false;
        double newX = getX() - 5 * getDirection();
        double newY = getY() - 5 * getDirection();
        return transporter.unloadLast(newX, newY, getDirection());
    }
    public boolean unload(T t) {
        return unload();
    }
    public void raiseRamp() {
        rampDown = false;
        transporter.loadableOff();
    }
    public void lowerRamp() {
        if(getCurrentSpeed() == 0) {
            rampDown = true;
            transporter.loadableOn();
        }
    }
    public boolean contains(T t) {
        return transporter.contains(t);
    }
    public void gas(double amount) {
        if(!rampDown) {
            incrementSpeed(amount, speedFactor(), getEnginePower());
        }
    }
    public void updateTransports(double xPosition, double yPositon, double direction) {
        transporter.updateTransports(xPosition, yPositon, direction);
    }
    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }
}
