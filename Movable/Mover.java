package Movable;

import Utilities.MyUtil;

public class Mover extends MovableAbstract {

    public Mover(double xPosition, double yPosition, double direction) {
        super(xPosition, yPosition, direction, 0);
    }

    /**
     * Changes the current X and Y coordinates based on objects currentSpeed value.
     */
    public void move() {
        setX(Math.cos(getDirection()) * getCurrentSpeed());
        setY(-Math.sin(getDirection()) * getCurrentSpeed());
    }

    /**
     * Changes direction by one degree (PI / 180) to the left.
     */
    public void turnLeft(){
        setDirection((getDirection() + (Math.PI / 180)) % (Math.PI * 2));
    }

    /**
     * Changes direction by one degree (PI / 180) to the right.
     */
    public void turnRight(){
        setDirection((getDirection() - (Math.PI / 180)) % (Math.PI * 2));
    }
    /**
     * Sets a new higher currentSpeed value.
     * New value will be between 0 and enginePower.
     * @param amount Should be between 0 and 1.
     */
    public void incrementSpeed(double amount, double speedFactor, double max) {
        setCurrentSpeed(MyUtil.clamp(getCurrentSpeed() + speedFactor * amount, 0, max));
    }

    /**
     * Sets a new lower currentSpeed value.
     * New value will be between 0 and enginePower.
     * @param amount Should be between 0 and 1.
     */
    public void decrementSpeed(double amount, double speedFactor, double max) {
        setCurrentSpeed(MyUtil.clamp(getCurrentSpeed() - speedFactor * amount, 0, max));
    }
}
