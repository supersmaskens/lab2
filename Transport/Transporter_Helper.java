package Transport;

import java.util.List;

public class Transporter_Helper extends TransporterAbstract{
    private final int maxTransportables;

    public Transporter_Helper(int max) {
        maxTransportables = max;
    }
    public Transporter_Helper(int max, Transportable t) {
        maxTransportables = max;
        addTransportable(t);
    }
    public Transporter_Helper(int max, List<Transportable> ts) {
        maxTransportables = max;
        for (Transportable t : ts) {
            addTransportable(t);
        }
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
    public void updateTransportables() {

    }
}

