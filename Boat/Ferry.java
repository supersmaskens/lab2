package Boat;

import Movable.*;
import Transport.*;
import Cars.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Ferry<T extends Transportable> extends Boat implements Transporter<T> {
    /**
     * Transporter_Helper declaration
     * so that the classes methods can be used.
     */
    private final Transporter_Helper<T> transporter;

    /**
     *
     * @param xPosition start position on the x-axis
     * @param yPosition start position on the y-axis
     * @param direction start direction using radians 0 means along x-axis
     * @param capacity max amount of Transportables.
     */

    public Ferry(double xPosition, double yPosition, double direction, int capacity) {
        super(Color.blue,250, "Ferry X3", xPosition, yPosition, direction);
        transporter = new Transporter_Helper<>(capacity);
    }

    /**
     * Overloaded Ferry for standard use with 30 capacity.
     */
    public Ferry() {
        this(0,0,0,30);
    }

    /**
     * Specific speed factor for Ferry.
     * @return factor used when decreasing throttle to gas.
     */
    public double speedFactor() {
        return getEnginePower() * 0.01 * 1.25;
    }

    /**
     * Checking if ferry contains
     * @param t Transportable
     * @return true if ferry contains t Transportable
     */
    public boolean contains(T t) {
        return transporter.contains(t);
    }

    /**
     * Loads transportable if there is space left in on the ferry.
     * @param t Transportable
     * @return true if t was loaded.
     */
    public boolean load(T t) {
        return transporter.load(t);
    }

    /**
     * Unloads first (index 0) transportable on the ferry if there is one.
     * @return true if first transportable was successfully unloaded.
     */
    public boolean unload() {
        return transporter.unloadFirst();
    }

    public boolean unload(T t) {
        return transporter.unload(t);
    }

    /**
     * Updates position of Ferry.
     * @param xPosition
     * @param yPosition
     * @param direction
     */
    public void updateTransports(double xPosition, double yPosition, double direction) {
        transporter.updateTransports(xPosition, yPosition, direction);
    }
}
