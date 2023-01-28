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
                && currentTransportables.size() < maxTransportables){
            return currentTransportables.add(t);
        }
        return false;
    }

    public boolean unload(Transportable t) {
        return currentTransportables.remove(t);
    }
    public boolean unloadFirst() {
        if (currentTransportables.isEmpty()) {
            return false;
        }
        currentTransportables.remove(0);
        return true;
    }
    public boolean unloadLast() {
        if (currentTransportables.isEmpty()) {
            return false;
        }
        currentTransportables.remove(currentTransportables.size()-1);
        return true;
    }
    public void updateTransportables() {

    }
}

