package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    //variables
    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;

    private final int storageCapacityInMB;
    private final int spinSpeedInRpm;

    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRpm = spinSpeed;
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;

        this.discInfo.put("Storage Capacity", String.valueOf((storageCapacity)));
        this.discInfo.put("Spin Speed" , String.valueOf((spinSpeed)));
    }

    public void writeData(String data) {
        this.discData += data;

    }

    public String readData () {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;

    }

    public void insert() {
        this.isInserted = true;

    }



}
