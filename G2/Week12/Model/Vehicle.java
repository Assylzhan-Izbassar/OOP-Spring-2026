
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Vehicle implements NavigatorStrategy {

    /**
     * Default constructor
     */
    public Vehicle() {
    }


    /**
     * @param speed
     */
    public abstract void move(int speed);

}