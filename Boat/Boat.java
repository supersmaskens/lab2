package Boat;

import Cars.*;

import java.awt.*;
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
        currentSpeed = 0.1;
    }

    /**
     * Sets the current speed to 0.
     */
    public void stopEngine() {
        currentSpeed = 0;
    }


    /**
     * SpeedFactor is used by each subclass to calculate speed when moving.
     */
    abstract double speedFactor();

    /**
     * Sets a new higher currentSpeed value.
     * New value will be between 0 and enginePower.
     *
     * @param amount Should be between 0 and 1.
     */
    public void incrementSpeed(double amount) {
        currentSpeed = clamp(getCurrentSpeed() + speedFactor() * amount, 0, enginePower);
    }

    /**
     * Sets a new lower currentSpeed value.
     * New value will be between 0 and enginePower.
     *
     * @param amount Should be between 0 and 1.
     */
    public void decrementSpeed(double amount) {
        currentSpeed = clamp(getCurrentSpeed() - speedFactor() * amount, 0, enginePower);
    }

    // TODO fix this method according to lab pm

    /**
     * Increases the currentSpeed value.
     * Calls incrementSpeed with a value between 0 and 1.
     *
     * @param amount Should be between 0 and 1.
     */
    public void gas(double amount) {
        incrementSpeed(clamp(amount, 0, 1));
    }

    /**
     * Decreases the currentSpeed value.
     * Calls decrementSpeed with a value between 0 and 1.
     *
     * @param amount Should be between 0 and 1.
     */
    public void brake(double amount) {
        decrementSpeed(clamp(amount, 0, 1));
    }
}