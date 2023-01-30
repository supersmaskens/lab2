package Transport;

import java.util.ArrayList;
import java.util.List;

public class Transporter_Helper<T extends Transportable> implements Transporter<T>{

    private final List<T> currentTransports;

    private final int maxTransportables;
    private boolean canLoad;
    public void loadableOn() {
        canLoad = true;
    }
    public void loadableOff() {
        canLoad = false;
    }

    public Transporter_Helper(int max) {
        currentTransports = new ArrayList<>();
        maxTransportables = max;
    }

    public boolean canTransport(T t) {
        return canLoad && !t.beingTransported();
    }

    public boolean load(T t) {
        if(canTransport(t) && !contains(t)
                && currentTransports.size() < maxTransportables){
            return currentTransports.add(t);
        }
        return false;
    }

    public boolean unload(T t) {
        return currentTransports.remove(t);
    }
    public boolean unloadFirst(double xPosition, double yPositon, double direction) {
        if (currentTransports.isEmpty()) {
            return false;
        }
        updateTransport(currentTransports.get(0), xPosition, yPositon, direction);
        currentTransports.remove(0);
        return true;
    }
    public boolean unloadLast(double xPosition, double yPositon, double direction) {
        if (currentTransports.isEmpty()) {
            return false;
        }
        updateTransport(currentTransports.get(currentTransports.size()-1), xPosition, yPositon, direction);
        currentTransports.remove(currentTransports.size()-1);
        return true;
    }
    public boolean contains(T t)  {
        return currentTransports.contains(t);
    }
    public void updateTransport(T t, double xPosition, double yPosition, double direction) {
        if(currentTransports.contains(t)) {
            t.updatePosition(xPosition, yPosition, direction);
        }
    }
    public boolean isEmpty() {
        return currentTransports.isEmpty();
    }
    public void updateTransports(double xPosition, double yPosition, double direction) {
        for (T t : currentTransports) {
            updateTransport(t, xPosition, yPosition, direction);
        }
    }
}

