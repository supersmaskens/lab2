package Transport;

import java.util.ArrayList;
import java.util.List;

public class Transporter_Helper<T extends Transportable> extends TransporterAbstract<T>{
    private final int maxTransportables;

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
    public boolean unloadFirst() {
        if (currentTransports.isEmpty()) {
            return false;
        }
        currentTransports.remove(0);
        return true;
    }
    public boolean unloadLast() {
        if (currentTransports.isEmpty()) {
            return false;
        }
        currentTransports.remove(currentTransports.size()-1);
        return true;
    }
    public boolean contains(T t)  {
        return currentTransports.contains(t);
    }
    public void updateTransport(T t)
    public void updateTransports(double xPosition, double yPosition, double direction) {

    }
}

