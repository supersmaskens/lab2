package Transport;

public interface Transporter {
    boolean contains(Transportable t);
    void updateTransportables();
    boolean load(Transportable t);
    boolean unload(Transportable t);

}
