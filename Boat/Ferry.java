package Boat;

import Movable.*;
import Transport.*;
import Cars.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Ferry extends Boat implements Transporter {
    private Transporter_Helper ferry;


    public Ferry(double xPosition, double yPosition, double direction, double currentSpeed) {
        super(Color.blue,250, "BigböyFerry", xPosition, yPosition, direction);
        ferry = new Transporter_Helper(30);
        ferry.addTransportable("PassengerCar");
    }
    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }
    public boolean contains(Transportable t) {
        return false;
    }

    public boolean load(Transportable t) {
        return false;
    }
    public boolean unload(Transportable t) {
        return false;
    }
}
