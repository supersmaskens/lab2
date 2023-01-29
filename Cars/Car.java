package Cars;

import java.awt.*;

import Utilities.MyUtil;

import Movable.*;
import Transport.*;

/**
 * Abstract class representing a car.
 */
public abstract class Car implements Movable, Transportable{

    private MovableAbstract movable;
    private final int nrDoors;
    /**
     * Engine power of the car.
     */
    private double enginePower;

    /**
     * Color of the car.
     */
    private Color color;
    /**
     * The car model name.
     */
    private final String modelName;

    /**
     * Basic constructor for a car.
     * @param nrDoors Number of doors.
     * @param color Color of the car.
     * @param enginePower Engine power, also serves as max speed.
     * @param name Model name for the car.
     * @param xPosition Initial X position.
     * @param yPosition Initial Y position.
     * @param direction Initial direction.
     */
    public Car(int nrDoors, Color color, double enginePower, String name,
               double xPosition, double yPosition, double direction) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = name;
        movable = new Movable_Helper(xPosition, yPosition, direction);
    }

    /**
     * Number of doors that the car has.
     */
    public int getNrDoors() {
        return nrDoors;
    }

    /**
     * Gives the engine power.
     * @return Engine power.
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * Gives the name of the model.
     * @return Name of the cars model.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Gives the color of the car.
     * @return The cars current color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets a new color for the car.
     * @param clr The new color.
     */
    public void setColor(Color clr) {
        color = clr;
    }

    /**
     * Sets the current speed to 0.1.
     */
    public void startEngine() {
        movable.setCurrentSpeed(0.1);
    }

    /**
     * Sets the current speed to 0.
     */
    public void stopEngine() {
        movable.setCurrentSpeed(0);
    }


    /**
     * SpeedFactor is used by each subclass to calculate speed when moving.
     */
    abstract double speedFactor();



    // TODO fix this method according to lab pm

    /**
     * Increases the currentSpeed value.
     * Calls incrementSpeed with a value between 0 and 1.
     * @param amount Should be between 0 and 1.
     */
    public void gas(double amount) {
        movable.incrementSpeed(amount, speedFactor(), enginePower);
    }

    // TODO fix this method according to lab pm

    /**
     * Decreases the currentSpeed value.
     * Calls decrementSpeed with a value between 0 and 1.
     * @param amount Should be between 0 and 1.
     */
    public void brake(double amount) {
        movable.decrementSpeed(amount, speedFactor(), enginePower);
    }
    public void move() {
        movable.move();
    }
    public void turnLeft() {
        movable.turnLeft();
    }
    public void turnRight() {
        movable.turnRight();
    }
}

