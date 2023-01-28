package Boat;

import Cars.*;
import java.util.ArrayList;
import Transport.*;
import Movable.*;


public abstract class Boat implements Movable {
    private String name;
    private double xPosition;
    private double yPosition;
    private double direction;

    private ArrayList<Car> cars;
    private Movable_Helper movable;

    public Boat(String name, double xPosition, double yPosition, double direction) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }
    public void turnLeft() {
        movable.turnLeft();
    }

}