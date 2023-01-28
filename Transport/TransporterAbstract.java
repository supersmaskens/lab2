package Transport;

import java.util.List;

public abstract class TransporterAbstract implements Transporter{
    protected List<Transportable> Transportables;
    private boolean canLoad;
    public void loadableOn() {
        canLoad = true;
    }
    public void loadableOff() {
        canLoad = false;
    }
    public boolean contains(Transportable t)  {
        return Transportables.contains(t);
    }
    public abstract void updateTransportables();
    public abstract boolean load(Transportable t);
    public abstract boolean unload(Transportable t);
}
