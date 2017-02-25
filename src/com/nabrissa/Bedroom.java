package com.nabrissa;

/**
 * Created by lucasjcastro on 24/2/17.
 */
public class Bedroom {
    private Door door;
    private Window window;
    private Bed bed;
    private Closet closet;
    private Lamp lamp;

    public Bedroom(Door door, Window window, Bed bed, Closet closet, Lamp lamp) {
        this.door = door;
        this.window = window;
        this.bed = bed;
        this.closet = closet;
        this.lamp = lamp;
    }

    public void openDoor() {
        System.out.println("Bedroom -> Opening the door");
        door.doorAction("open");
    }

    public void closeDoor() {
        System.out.println("Bedroom -> Closing the door");
        door.doorAction("close");
    }

    public Lamp lamp() {
        return lamp;
    }

    public Window window() {
        return window;
    }

    public Bed bed() {
        return bed;
    }
}
