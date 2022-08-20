package com.example.cw6;

public class Fridge {
    private String name ;
    private Double Height;
    private int image;
    private String features;
    private String company;

    public Fridge(String name, Double height, int image, String features, String company) {
        this.name = name;
        Height = height;
        this.image = image;
        this.features = features;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
