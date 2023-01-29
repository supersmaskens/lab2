package Transport;

import java.util.List;

public abstract class TransporterAbstract implements Transporter<Transportable>{
    protected List<Transportable> currentTransports;
    protected boolean canLoad;
    public void loadableOn() {
        canLoad = true;
    }
    public void loadableOff() {
        canLoad = false;
    }

    public abstract boolean contains(Transportable t);
    public abstract boolean load(Transportable t);
    public abstract boolean unload(Transportable t);
    public abstract void updateTransports(double xPosition, double yPosition, double direction);
}
