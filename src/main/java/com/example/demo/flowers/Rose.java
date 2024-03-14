package com.example.demo.flowers;

public class Rose implements Flower {
    private final String color;

    public Rose(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
