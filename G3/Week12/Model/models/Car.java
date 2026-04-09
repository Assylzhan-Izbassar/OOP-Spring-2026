package models;

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
     * The name of the Car class.
     */
    private String name;

    /**
     * @param speed 
     * @return
     */
    public abstract int drive(int speed);

}