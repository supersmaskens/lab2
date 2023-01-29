package Cars;

import Transport.Transportable;
import Transport.TransporterAbstract;
import Transport.Transporter_Helper;

import java.awt.*;

public class CarTransport extends Car {
    private final Transporter_Helper transporter;

    private boolean rampDown;

    public CarTransport(int nrDoors, Color color, double enginePower, String name,
                        double xPosition, double yPosition, double direction, Transporter_Helper t) {
        super(nrDoors, color, enginePower, name, xPosition, yPosition, direction);
        transporter = t;
        rampDown = false;
        transporter.loadableOff();
    }
    public CarTransport(double xPosition, double yPosition, double direction,
                        int capacity, String transportType) {
        this(2, Color.red, 100, "Biltransport", xPosition, yPosition, direction
        , new Transporter_Helper(capacity, transportType));
    }
    public void load(Transportable t) {
        transporter.load(t);
    }
    public void unload() {
        //transporter.updateTransports();
        transporter.unloadLast();
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
    /*public void gas(double amount) {
        movable.incrementSpeed(amount, speedFactor(), enginePower);
    }*/
    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }
}
