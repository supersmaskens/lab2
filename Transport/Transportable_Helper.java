package Transport;

import java.util.List;

public class Transportable_Helper implements Transportable {
    private List<String> possibleTransporters;
    public void beTransported(Transporter t) {
        for (String s : possibleTransporters) {
            if (s.equals("" + t)) {
                t.load(this);
            }
        }
    }
}
