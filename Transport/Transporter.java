package Transport;

public interface Transporter {
    boolean contains(Transportable t);
    void updateTransportables();
    void load(Transportable t);
    void removeTransportable(Transportable t);

}
