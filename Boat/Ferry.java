package Boat;

import Movable.*;
import Transport.*;
import Cars.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Ferry<T extends Transportable> extends Boat implements Transporter<T> {
    private final Transporter_Helper<T> transporter;

    public Ferry(double xPosition, double yPosition, double direction, int capacity) {
        super(Color.blue,250, "Ferry X3", xPosition, yPosition, direction);
        transporter = new Transporter_Helper<>(capacity);
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }
    public boolean contains(T t) {
        return transporter.load(t);
    }

    public boolean load(T t) {
        return false;
    }
    public boolean unload(T t) {
        return false;
    }
    public void updateTransports(double xPosition, double yPosition, double direction) {
        transporter.updateTransports(xPosition, yPosition, direction);
    }
}
