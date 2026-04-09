
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Car extends Vehicle {

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * 
     */
    private String make;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private int year;

    /**
     * 
     */
    private List<Door> doors;


    /**
     * @return
     */
    public void start() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void stop() {
        // TODO implement here
        return null;
    }

    /**
     * @param inSpeed 
     * @return
     */
    public void drive(int inSpeed) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Door> getDoors() {
        // TODO implement here
        return null;
    }

    /**
     * @param speed
     */
    public abstract void move(int speed);

}