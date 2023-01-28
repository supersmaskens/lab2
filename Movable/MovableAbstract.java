package Movable;

public abstract class MovableAbstract implements Movable{

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


    /**
     * Clamp method, not sure where to put it.
     * @param value A double to be clamped.
     * @param lowerBound Lowerbound.
     * @param upperBound Upperbound.
     * @return Clamped value.
     */
    private double clamp(double value, double lowerBound, double upperBound){
        return Math.max(lowerBound, Math.min(upperBound, value));
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
}