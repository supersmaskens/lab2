package Transport;

import java.util.List;

public abstract class TransporterAbstract<T extends Transportable> implements Transporter<T>{
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
    public boolean removeTransportable(T t) {
        return possibleTransportables.remove(t.getClass().getSimpleName());
    }
    public boolean canTransport(T t) {
        return possibleTransportables.contains(t.getClass().getSimpleName())
                && canLoad;
    }
    public boolean contains(T t)  {
        return currentTransports.contains(t);
    }
    public abstract boolean load(T t);
    public abstract boolean unload(T t);
    public abstract void updateTransportables();
}
