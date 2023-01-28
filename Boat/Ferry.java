package Boat;

import Movable.*;
import Transport.*;
import Cars.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Ferry extends Boat implements Transporter {
    private Transporter_Helper ferry;
    private List<Transportable> possibleTransportables = new ArrayList<>(); //Not sure how to initiate this with Car


    public Ferry(double xPosition, double yPosition, double direction, double currentSpeed) {
        super(xPosition, yPosition, direction, currentSpeed);
        ferry = new Transporter_Helper(30); // is it possibleTransportables or current transportables
                                                 // that is second parameter?
    }
    public boolean contains(Transportable t) {
        return ferry.contains(t);
    }

    public boolean load(Transportable t) {
        return ferry.load(t);
    }
    public boolean unload(Transportable t) {
        return ferry.unloadFirst();
    }
}
