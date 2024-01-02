package com.codingtester.tourisminoman;

import java.io.Serializable;

public class Model implements Serializable {
    private String id;
    private String name;
    private String phone;
    private String lat;
    private String lng;
    private String description;
    private int image;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Model(String id, String name, String phone, String lat, String lng, String description, int image, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.image = image;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Model(String id, String name, String phone, String lat, String lng, String description, int image) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.image = image;
    }

    public Model(String name, String phone, String lat, String lng, String description, int image) {
        this.name = name;
        this.phone = phone;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
