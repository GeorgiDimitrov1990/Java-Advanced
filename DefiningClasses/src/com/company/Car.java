package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public static int objectCounter = 0;

    private String brand;
    private String model;
    private int horsePower;
    List<Part> parts;

    public Car(String brand, String model, int horsePower) {
        this(brand, model);
        this.horsePower = horsePower;

    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;

    }

    public Car(String brand){
        this.brand = brand;
        this.parts = new ArrayList<>();
        Car.objectCounter++;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int verifyHorsePowerNotLessThanOne(int horsePower) {
        return Math.max(horsePower, 0);
    }

    public void setHorsePower(int horsePower) {

        this.horsePower = verifyHorsePowerNotLessThanOne(horsePower);
    }

    public String getModel(){
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public String getBrand() {
        return this.brand;
    }

    public void increaseHP (int horsePower){
        this.horsePower += verifyHorsePowerNotLessThanOne(horsePower);
    }
    public String getBrandAsCapitalCases(){
        String brand = this.brand.toUpperCase();
        return brand;
    }

    public String carInfo(){
        return this.toString();
    }

    @Override
    public String toString(){
        return String.format("This car is : %s %s - %d HP",
                this.getBrand() != null ? this.getModel() : "unknown",
                this.getModel(),
                this.getHorsePower() != 0 ? this.getHorsePower() : - 1);
    }
}
