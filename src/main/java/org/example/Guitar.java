package org.example;

public class Guitar {
    // Attributes
    private String brand;
    private String model;
    private int numberOfStrings;
    private boolean electric;

    // Constructor
    public Guitar(String brand, String model, int numberOfStrings, boolean electric) {
        this.brand = brand;
        this.model = model;
        this.numberOfStrings = numberOfStrings;
        this.electric = electric;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean isElectric() {
        return electric;
    }

    // Method to display guitar info
    public void play() {
        System.out.println("Playing the " + brand + " " + model + " guitar.");
    }

    // toString method
    @Override
    public String toString() {
        return "Guitar [brand=" + brand + ", model=" + model +
                ", numberOfStrings=" + numberOfStrings + ", electric=" + electric + "]";
    }
}
