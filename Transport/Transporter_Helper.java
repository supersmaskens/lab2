package Transport;

import java.util.List;

public class Transporter_Helper extends TransporterAbstract{
    private int maxTransportables;

    public boolean load(Transportable t) {
        if(Transportables.size() < maxTransportables) {
            return Transportables.add(t);
        }
        return false;
    }

    public boolean unload(Transportable t) {
        return Transportables.remove(t);
    }

    public void updateTransportables() {

    }
}

