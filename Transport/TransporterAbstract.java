package Transport;

import java.util.List;

public abstract class TransporterAbstract<T extends Transportable> implements Transporter<T>{
    protected List<T> currentTransports;
    protected boolean canLoad;
    public void loadableOn() {
        canLoad = true;
    }
    public void loadableOff() {
        canLoad = false;
    }

    public abstract boolean contains(T t);
    public abstract boolean load(T t);
    public abstract boolean unload(T t);
    public abstract void updateTransports(double xPosition, double yPosition, double direction);
}
