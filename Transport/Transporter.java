package Transport;

public interface Transporter<T extends Transportable> {
    boolean contains(T t);
    boolean load(T t);
    boolean unload(T t);

}
