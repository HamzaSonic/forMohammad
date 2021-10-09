package org.example;

public class ShapeFactory {
    public Shape generate(String shape){
        if (shape.equalsIgnoreCase("circle"))
            return new Circle();
        return new Triangle();
    }
}
