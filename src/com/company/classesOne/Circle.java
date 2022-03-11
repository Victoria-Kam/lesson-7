package com.company.classesOne;

import com.company.interfaces.Figure;

public class Circle implements Figure {

    private double circleRadius;
    private final double PI = 3.14;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double square() {
        return Math.pow(this.circleRadius, 2) * PI;
    }

    public void print(){
        System.out.println("Площадь круга: " + this.square());
    }
}
