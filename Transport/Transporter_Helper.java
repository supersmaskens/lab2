package Transport;

import java.util.ArrayList;
import java.util.List;

public class Transporter_Helper extends TransporterAbstract{
    private final List<String> possibleTransportables;
    private final int maxTransportables;

    public Transporter_Helper(int max) {
        possibleTransportables = new ArrayList<>();
        currentTransports = new ArrayList<>();
        maxTransportables = max;
    }
    public Transporter_Helper(int max, String transportable) {
        this(max);
        addTransportable(transportable);
    }
    public Transporter_Helper(int max, String[] transportable) {
        this(max);
        for (String s : transportable) {
            addTransportable(s);
        }
    }
    public boolean addTransportable(Transportable t) {
        if (!possibleTransportables.contains(t.getClass().getSimpleName())) {
            return possibleTransportables.add(t.getClass().getSimpleName());
        }
        return false;
    }
    public boolean addTransportable(String s) {
        if (!possibleTransportables.contains(s)) {
            return possibleTransportables.add(s);
        }
        return false;
    }
    public boolean removeTransportable(Transportable t) {
        return possibleTransportables.remove(t.getClass().getSimpleName());
    }
    public boolean canTransport(Transportable t) {
        return possibleTransportables.contains(t.getClass().getSimpleName())
                && canLoad && !t.beingTransported();
    }

    public boolean load(Transportable t) {
        if(canTransport(t) && !contains(t)
                && currentTransports.size() < maxTransportables){
            return currentTransports.add(t);
        }
        return false;
    }

    public boolean unload(Transportable t) {
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
    public boolean contains(Transportable t)  {
        return currentTransports.contains(t);
    }
    public void updateTransports(double xPosition, double yPosition, double direction) {
    }
}

