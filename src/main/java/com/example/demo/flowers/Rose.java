package com.example.demo.flowers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
@Getter
public class Rose implements Flower {
    String color;
}
