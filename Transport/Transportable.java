package Transport;

public interface Transportable {
    boolean beingTransported();
    boolean beTransported();
    void updatePosition(double xPosition, double yPosition, double direction);
}
