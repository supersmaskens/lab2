package Boat;

import Transport.*;
import Cars.*;

import java.awt.*;


public class Ferry extends Boat implements Transporter {
    private Transporter_Helper transport;
    private


    public void load(Transporter_Helper transport) {
        cars.add(car);
    }
    public Car unload() {
        return cars.remove(0);
    }
    public Volvo240() {
        super("ferry", Color.black, 100, "Cars.Volvo240",
                xPosition, yPosition, direction % (2 * Math.PI));
    }





}
