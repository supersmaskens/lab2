package Cars;

import java.awt.*;

public class Scania extends Car {

    private int flatbedPosition;

    public Scania(double xPosition, double yPosition, double direction){
        super(2, Color.black, 400, "Cars.Scania", xPosition, yPosition, direction);
        stopEngine();
        flatbedPosition = 0;
    }

    /**
     * Lowers the flatbed one degree per call
     * @return True if flatbedPosition > 0 and lowering is performed
     */
    public boolean decreaseTiltFlatbed() {
        if(flatbedPosition>0){
            flatbedPosition--;
            return true;
        }
        return false;
    }

    /**
     * Raises the flatbed one degree per call
     * @return True if flatbedPosition < 70 and raising is performed
     */
    public boolean increaseTiltFlatbed() {
        if(flatbedPosition<70 && getCurrentSpeed() == 0) {
            flatbedPosition++;
            return true;
        }
        return false;
    }

    /**
     * Returns angle of flatbed
     * @return angle of flatbed
     */
    public int getFlatbedPosition() {
        return flatbedPosition;
    }

    /**
     * Starts engine if flatbed is completely lowered
     */
    @Override
    public void startEngine() {
        if(flatbedPosition < 1) {
            super.startEngine();
        }
    }
    /**
     * Increases speed if flatbed is completely lowered
     */
    @Override
    public void gas(double amount) {
        if(flatbedPosition < 1) {
            super.gas(amount);
        }
    }
    @Override
    double speedFactor() {
        return getEnginePower()/3;
    }
}
