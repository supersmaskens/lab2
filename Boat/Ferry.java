package Boat;

import Movable.*;
import Transport.*;
import Cars.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Ferry extends Boat implements Transporter<Transportable> {
    private Transporter_Helper transporter;

    public Ferry(double xPosition, double yPosition, double direction, int capacity) {
        super(Color.blue,250, "BigböyFerry", xPosition, yPosition, direction);
        transporter = new Transporter_Helper(30);
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }
    public boolean contains(Transportable t) {
        return transporter.load(t);
    }

    public boolean load(Transportable t) {
        return false;
    }
    public boolean unload(Transportable t) {
        return false;
    }
    public void updateTransports(double xPosition, double yPosition, double direction) {
        transporter.updateTransports(xPosition, yPosition, direction);
    }
}
