package com.nabrissa;

public class Main {

    public static void main(String[] args) {

        // Challenge
        // Create a single room of a house using composition
        // Think about the things that should be included in the room
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Door door = new Door(1,"Wood", new Dimensions(200,90,0));
        Window window = new Window(2, "Glass", new Dimensions(120,70,0));
        Bed bed = new Bed("King Size", 2, new Dimensions(15,190, 200));
        Closet closet = new Closet("Wood",3, new Dimensions(200,250,0));
        Lamp lamp = new Lamp(3, "Metal", "Black");

        Bedroom bedroom = new Bedroom(door, window, bed, closet, lamp);

        bedroom.lamp().powerOn();
        bedroom.openDoor();
        bedroom.closeDoor();
        System.out.println(bedroom.window().getMaterial());
        bedroom.closeDoor();


    }
}
