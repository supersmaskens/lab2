package Transport;

public interface Transporter {
    boolean contains(Transportable t);
    boolean load(Transportable t);
    boolean unload(Transportable t);

}
