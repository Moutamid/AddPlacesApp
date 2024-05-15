package com.moutamid.addplacesapp.model;

public class LocationModel {
    public String name, details, image, category;
    double lat, lng;

    public LocationModel(String name, String details, String image, String category, double lat, double lng) {
        this.name = name;
        this.details = details;
        this.image = image;
        this.category = category;
        this.lat = lat;
        this.lng = lng;
    }
}
