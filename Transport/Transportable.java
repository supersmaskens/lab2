package Transport;

public interface Transportable {
    void updatePosition(double xPosition, double yPosition, double direction);
    boolean beingTransported();
}
