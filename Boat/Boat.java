package Boat;
import Cars.*;
import java.util.ArrayList;


public abstract class Boat {
    private String name;
    private double xPosition;
    private double yPosition;
    private double direction;
    private Transporter_Helper transporterHelper;
    private ArrayList<Car> cars;

    public Boat(String name, double xPosition, double yPosition, double direction) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        this.transporterHelper = transporterHelper;
    }



    }


}
