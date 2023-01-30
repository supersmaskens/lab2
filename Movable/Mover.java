package Movable;

import Utilities.MyUtil;

public class Mover implements Movable {

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

    private double currentSpeed;

    public Mover(double xPosition, double yPosition, double direction, double currentSpeed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        this.currentSpeed = currentSpeed;

    }
    public Mover(double xPosition, double yPosition, double direction){
        this(xPosition,yPosition,direction,0);
    }
    public Mover(){this(0,0,0,0);}
    /**
     * Gives the current X position.
     * @return Current X position.
     */
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
    public void move() {
        setX(Math.cos(getDirection()) * getCurrentSpeed());
        setY(-Math.sin(getDirection()) * getCurrentSpeed());
    }
    public void updatePosition(double xPosition, double yPosition, double direction) {
        setX(xPosition);
        setY(yPosition);
        setDirection(direction);
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
