package com.nabrissa;

/**
 * Created by lucasjcastro on 24/2/17.
 */
public class Window {
    private int leafNumber;
    private String material;

    private Dimensions dimensions;

    public Window(int leafNumber, String material, Dimensions dimensions) {
        this.leafNumber = leafNumber;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void windowAction(String action) {
        String validAction = action.toLowerCase();
        if (validAction.equals("open") || validAction.equals("close")) {
            System.out.println("Window.windowAction(): " + action.substring(0,1).toUpperCase() + action.substring(1).toLowerCase());
        } else {
            System.out.println(action + " is not a valid action (open/close).");
        }
    }

    public int getLeafNumber() {
        return leafNumber;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
