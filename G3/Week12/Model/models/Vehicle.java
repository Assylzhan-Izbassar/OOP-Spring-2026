package models;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Vehicle implements Moveable {

    /**
     * Default constructor
     */
    public Vehicle() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String type;


    /**
     * @param speed 
     * @return
     */
    public abstract int drive(int speed);

}