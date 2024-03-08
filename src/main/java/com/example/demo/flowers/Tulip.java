package com.example.demo.flowers;


public class Tulip implements Flower {
    private final String color;

    public Tulip(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
