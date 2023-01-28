package Boat;

import Movable.Movable_Helper;
import Transport.*;
import Cars.*;

import java.awt.*;


public class Ferry extends Boat implements Transporter {
    private Transporter_Helper transport;
    private
    public Ferry(double xPosition, double yPosition, double direction, double currentSpeed) {
        super(xPosition, yPosition, direction, currentSpeed);
    }

    public void load(Transporter_Helper transport) {
    }
    public Car unload() {
        transport.remove(0);
    }
}
