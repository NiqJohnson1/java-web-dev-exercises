package org.launchcode.studio7;

import exercises.Audio.src.org.launchcode.studio7.BaseDisc;
import exercises.Audio.src.org.launchcode.studio7.OpticalDisc;

public class CD extends BaseDisc implements OpticalDisc {
    int storageCapacity;

    public CD(int storageCapacity, String name, int remainingCapacity, int capacityUsed, String diskType, int minSpeed, int maxSpeed) {
        super(name, remainingCapacity, capacityUsed, diskType, minSpeed, maxSpeed);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void readData() {
        System.out.println("Music is playing");

    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "CD{" +
                "storageCapacity=" + storageCapacity +
                '}';
    }
}

/* INTERFACE
- spinDisc
- thickness
- readData
- yearCreated
- cost

*/
