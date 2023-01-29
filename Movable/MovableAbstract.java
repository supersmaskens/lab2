package Movable;

import java.awt.*;

public abstract class MovableAbstract{

    /**
     * Represents position on X-axis.
     */
    private double xPosition;
    /**
     * Represents position on Y-axis.
     */
    private double yPosition;
    /**
     * Represents direction and should always be between -2 * PI and 2 * PI.
     */
    private double direction;

    /**
     * Gives the current X position.
     * @return Current X position.
     */

    private double currentSpeed;


    public MovableAbstract(double xPosition, double yPosition, double direction, double currentSpeed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        this.currentSpeed = currentSpeed;
    }


    public double getX() {
        return xPosition;
    }

    /**
     * Sets a new X position.
     * @param xPosition New X position.
     */
    public void setX(double xPosition) {
        this.xPosition = xPosition;
    }
    /**
     * Gives the current Y position.
     * @return Current Y position.
     */
    public double getY() {
        return yPosition;
    }

    /**
     * Sets a new Y position.
     * @param yPosition New Y Position.
     */
    public void setY(double yPosition) {
        this.yPosition = yPosition;
    }
    /**
     * Gives the current direction.
     * @return Current direction.
     */
    public double getDirection() {
        return direction;
    }

    /**
     * Sets a new direction.
     * @param direction New direction.
     */
    public void setDirection(double direction) {
        this.direction = direction;
    }


    /**
     * Gives the current speed.
     * @return Current speed.
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(double newSpeed) {
        currentSpeed = newSpeed;
    }

    /**
     * Changes the current X and Y coordinates based on objects currentSpeed value.
     */
    public abstract void move();

    /**
     * Changes direction by one degree (PI / 180) to the left.
     */
    public abstract void turnLeft();

    /**
     * Changes direction by one degree (PI / 180) to the right.
     */
    public abstract void turnRight();
    public abstract void incrementSpeed(double amount, double speedFactor, double max);
    public abstract void decrementSpeed(double amount, double speedFactor, double max);
}