package Transport;

import java.util.List;

public class Transportable_Helper implements Transportable {
    public boolean beLoaded(Transporter t) {
        return t.load(this);
    }
}
