package com.company;

public class House {
    public final String address;
    public final float floorSpace;
    public String ownersName;

    public House(String address, float floorSpace, String ownersName) {
        this.address = address;
        this.floorSpace = floorSpace;
        this.ownersName = ownersName;
    }

    public House(String address, float floorSpace) {
        this.address = address;
        this.floorSpace = floorSpace;
    }
}
