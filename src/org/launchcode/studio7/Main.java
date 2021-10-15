package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD(250, "CD-1", 100, 150, "CD", 200, 500);
        DVD dvd1 = new DVD(400, "DVD-1", 100, 300, "DVD", 570, 1600);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.readData();
        dvd1.readData();

        System.out.println("CD Storage Capacity: " + cd1.getStorageCapacity());
        System.out.println("DVD Storage Capacity: " + dvd1.getStorageCapacity());

    }
}
