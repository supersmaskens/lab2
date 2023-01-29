package Cars;
import Transport.*;

public class Workshop<T extends Transportable> implements Transporter {
    private TransporterAbstract transporter;


    public Workshop(int capacity, Transportable t) {
        transporter = new Transporter_Helper(capacity, t);
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
