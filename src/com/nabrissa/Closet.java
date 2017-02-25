package com.nabrissa;

/**
 * Created by lucasjcastro on 24/2/17.
 */
public class Closet {
    private String material;
    private int doors;

    private Dimensions dimensions;

    public Closet(String material, int doors, Dimensions dimensions) {
        this.material = material;
        this.doors = doors;
        this.dimensions = dimensions;
    }

    public void doorAction (String action) {
        String validAction = action.toLowerCase();
        if (validAction.equals("open") || validAction.equals("close")) {
            System.out.println("Closet.doorAction():  " + action.substring(0,1).toUpperCase() + action.substring(1).toLowerCase());
        } else {
            System.out.println(action + " is not a valid action (open/close).");
        }
    }

    public String getMaterial() {
        return material;
    }

    public int getDoors() {
        return doors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
