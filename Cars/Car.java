package Cars;

import java.awt.*;

import Movable.*;

/**
 * Abstract class representing a car.
 */
public abstract class Car extends Mover{

    private final int nrDoors;
    /**
     * Engine power of the car.
     */
    private final double enginePower;

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
        super(xPosition, yPosition, direction);
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = name;
    }

    public Car(){           //Dessa är svåra att testa eftersom dom inte kan användas utan att en subtyp kallar på dom.
        this(0,Color.cyan,0,"",0,0,0);
    }
    public Car(String name){
        this(0,Color.green,0,name,0,0,0);
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
        setCurrentSpeed(0.1);
    }

    /**
     * Sets the current speed to 0.
     */
    public void stopEngine() {
        setCurrentSpeed(0);
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
        incrementSpeed(amount, speedFactor(), enginePower);
    }

    // TODO fix this method according to lab pm

    /**
     * Decreases the currentSpeed value.
     * Calls decrementSpeed with a value between 0 and 1.
     * @param amount Should be between 0 and 1.
     */
    public void brake(double amount) {
        decrementSpeed(amount, speedFactor(), enginePower);
    }

}

