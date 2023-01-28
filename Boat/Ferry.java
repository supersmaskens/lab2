package Boat;
import Transport.*;
import Cars.*;

public class Ferry extends Boat implements Transporter {
    private Transporter_Helper transport;
    private


    public void load(Car car) {
        cars.add(car);
    }
    public Car unload() {
        return cars.remove(0);
    }






}
