package com.example.demo.flowers;

import com.example.demo.interfaces.Flower;


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
