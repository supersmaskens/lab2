package Transport;

import java.util.List;

public abstract class TransporterAbstract implements Transporter{
    protected List<String> possibleTransportables;
    protected List<Transportable> currentTransports;
    private boolean canLoad;
    public void loadableOn() {
        canLoad = true;
    }
    public void loadableOff() {
        canLoad = false;
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
                && canLoad && contains(t);
    }
    public boolean contains(Transportable t)  {
        return currentTransports.contains(t);
    }
    public abstract boolean load(Transportable t);
    public abstract boolean unload(Transportable t);
    public abstract void updateTransportables();
}
