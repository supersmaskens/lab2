import Cars.Saab95;
import Cars.Volvo240;
import Cars.Workshop;
import Transport.Transportable;

public class TestTransport {
    public void heyhey() {
        Workshop<Transportable> ws = new Workshop<>(32, "Volvo240");
        Saab95 car = new Saab95();
        ws.load(car);
    }
}
