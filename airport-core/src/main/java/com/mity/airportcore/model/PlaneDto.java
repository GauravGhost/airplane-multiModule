package com.mity.airportcore.model;

public class PlaneDto {
    String name;
    int engineCount;

    public PlaneDto(String name, int engineCount) {
        this.name = name;
        this.engineCount = engineCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngineCount() {
        return engineCount;
    }

    public void setEngineCount(int engineCount) {
        this.engineCount = engineCount;
    }
}
