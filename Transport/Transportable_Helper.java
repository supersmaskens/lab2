package Transport;

import java.util.List;

public class Transportable_Helper implements Transportable {
    public boolean beLoaded(TransporterAbstract t) {
        return t.load(this);
    }
}
