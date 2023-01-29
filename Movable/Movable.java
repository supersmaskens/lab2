package Movable;

/**
 * Interface for movable objects.
 * NOTE: Does not include any required attributes (X position, direction, etc).
 */
public interface Movable {
    void move();
    void turnLeft();
    void turnRight();
    void updatePosition(double xPosition, double yPosition, double direction);
}
