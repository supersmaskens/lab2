package Cars;
import Transport.*;

public class Workshop<T extends Transportable> implements Transporter<T> {
    private TransporterAbstract transporter;


    public Workshop(int capacity, String transportable) {
        transporter = new Transporter_Helper(capacity, transportable);
    }




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
}
