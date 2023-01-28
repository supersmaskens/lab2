package Boat;

import Cars.*;

import java.util.ArrayList;

import Transport.*;
import Movable.*;


public abstract class Boat implements Movable {
    final private Movable_Helper boat;

    public Boat(double xPosition, double yPosition, double direction, double currentSpeed) {
        boat = new Movable_Helper(xPosition, yPosition, direction, currentSpeed);
    }

    public void turnLeft() {
        boat.turnLeft();
    }

    public void turnRight() {
        boat.turnRight();
    }

    public void move() {
        boat.move();
    }

}