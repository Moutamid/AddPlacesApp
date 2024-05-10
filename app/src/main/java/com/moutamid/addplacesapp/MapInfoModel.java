package com.moutamid.addplacesapp;

public class MapInfoModel {


    public MapInfoModel() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getLongitide() {
        return longitide;
    }

    public void setLongitide(String longitide) {
        this.longitide = longitide;
    }

    public String getLatitide() {
        return latitide;
    }

    public void setLatitide(String latitide) {
        this.latitide = latitide;
    }

    String name;
    String review;
    String longitide;
    String latitide;
    public MapInfoModel(String name, String review, String longitide, String latitide) {
        this.name = name;
        this.review = review;
        this.longitide = longitide;
        this.latitide = latitide;
    }



}
