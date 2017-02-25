package com.nabrissa;

/**
 * Created by lucasjcastro on 24/2/17.
 */
public class Bed {
    private String size;
    private int pillows;

    private Dimensions dimensions;

    public Bed(String size, int pillows, Dimensions dimensions) {
        this.size = size;
        this.pillows = pillows;
        this.dimensions = dimensions;
    }

    public String getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
