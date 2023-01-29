package Boat;

import Cars.*;

import java.awt.*;
import java.util.ArrayList;

import Transport.*;
import Movable.*;


public abstract class Boat implements Movable {
    final private MovableAbstract movable;

    /**
     * Color of the boat.
     */
    private Color color;
    private final double enginePower;
    /**
     * The boat model name.
     */
    private final String modelName;


    public Boat(Color color, double enginePower, String name,
                double xPosition, double yPosition, double direction) {
        this.color = color;
        this.enginePower = enginePower;
        modelName = name;
        movable = new Movable_Helper(xPosition, yPosition, direction);

    }

    public void turnLeft() {
        movable.turnLeft();
    }

    public void turnRight() {
        movable.turnRight();
    }

    public void move() {
        movable.move();
    }

// TODO Boat probably needs all these methods, maybe enginePower or something more general
// TODO Not sure how to inherit these though.

    public double getEnginePower() {
        return enginePower;
    }

    /**
     * Gives the name of the model.
     *
     * @return Name of the cars model.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Gives the color of the car.
     *
     * @return The cars current color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets a new color for the car.
     *
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
     *
     * @param amount Should be between 0 and 1.
     */
    public void gas(double amount) {
        movable.incrementSpeed(amount, speedFactor(), enginePower);
    }

    /**
     * Decreases the currentSpeed value.
     * Calls decrementSpeed with a value between 0 and 1.
     *
     * @param amount Should be between 0 and 1.
     */
    public void brake(double amount) {
        movable.decrementSpeed(amount, speedFactor(), enginePower);
    }
}