package com.nabrissa;

/**
 * Created by lucasjcastro on 24/2/17.
 */
public class Lamp {
    private int lightBulbs;
    private String material;
    private String color;

    public Lamp(int lightBulbs, String material, String color) {
        this.lightBulbs = lightBulbs;
        this.material = material;
        this.color = color;
    }

    public void powerOn() {
        System.out.println("Lamp.powerOn(): The light is ON");
    }

    public void powerOff() {
        System.out.println("Lamp.powerOff(): The light is OFF");
    }

    public int getLightBulbs() {
        return lightBulbs;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
