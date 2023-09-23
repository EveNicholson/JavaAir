package org.example;

public enum PlaneType {
    BOEING747(400, 80000),
    AIRBUS320(200, 50000);


    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    }
