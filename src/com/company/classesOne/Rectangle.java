package com.company.classesOne;

import com.company.interfaces.Figure;

public class Rectangle implements Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

     public double square(){               // if this method will be private →  classes.Rectangle interfaces.Figure;
                                            // attempting to assign weaker access privileges ('private'); was 'public'
        return this.sideA * this.sideB;
    }

    public void print(){
        System.out.println("Площадь прямоугольника: " + this.square());
    }

}
