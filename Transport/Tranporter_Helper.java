package Transport;

import java.util.List;

public class Tranporter_Helper implements Transporter{
    private int maxTransportables;
    private List<Transportable> Transportables;


    public boolean contains(Transportable t)  {
        return Transportables.contains(t);
    }

    public void load(Transportable t) {
        Transportables.add(t);
    }


    public void removeTransportable(Transportable t) {
        Transportables.remove(t);
    }

    public void updateTransportables() {

    }
}

