package com.PrinceTechSolution.TaxCalculator.Models;

public class CustomModelOne {

     String name;
    int ImageId;

    public CustomModelOne(String n, int imageId) {
        this.name = n;
        this.ImageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return ImageId;
    }
}
