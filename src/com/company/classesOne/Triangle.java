package com.company.classesOne;

import com.company.interfaces.Figure;

/*
 *  Площадь треугольника равна половине произведения его основания на высоту. S=(1/2: a) * h
 */

public class Triangle implements Figure {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double square() {
        return (side / 2) * height;
    }

    public void print(){
        System.out.println("Площадь треугольника: " + this.square());
    }
}
