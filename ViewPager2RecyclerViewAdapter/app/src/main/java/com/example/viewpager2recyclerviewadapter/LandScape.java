package com.example.viewpager2recyclerviewadapter;

public class LandScape {
    String landImageName;
    String landCation;

    public LandScape(String landImageName, String landCation) {
        this.landImageName = landImageName;
        this.landCation = landCation;
    }

    public String getLandImageName() {
        return landImageName;
    }

    public void setLandImageName(String landImageName) {
        this.landImageName = landImageName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
