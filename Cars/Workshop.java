package Cars;
import Transport.*;

public class Workshop<T extends Transportable> implements Transporter<T> {
    private final TransporterAbstract transporter;


    public Workshop(int capacity, String transportable) {
        transporter = new Transporter_Helper(capacity, transportable);
    }
    //public static Workshop<Volvo240> V240WS(){
    //    return new Workshop<>(32,"Volvo240");
    //}
    public void loadeableOn() {
        transporter.loadableOn();
    }

    public void loadableOff() {
        transporter.loadableOff();
    }

    public boolean contains(T t) {
        return transporter.contains(t);
    }

    public boolean load(T t) {
        return transporter.load(t);
    }

    public boolean unload(T t) {
        return transporter.unload(t);
    }

    public void updateTransports(double xPosition, double yPosition, double direction) {
        transporter.updateTransports(xPosition, yPosition, direction);
    }
}