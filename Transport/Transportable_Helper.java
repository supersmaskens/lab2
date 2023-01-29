package Transport;

import java.util.List;

public class Transportable_Helper {
    private boolean transported;
    public Transportable_Helper() {
        transported = false;
    }

    public void beTransported() {
        transported = !transported;
    }
}
