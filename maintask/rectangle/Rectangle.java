package com.teachmeskills.lesson_6.maintask.rectangle;

import com.teachmeskills.lesson_6.maintask.figure.Figure;

public class Rectangle extends Figure {
    double sideA;
    double sideB;
    public Rectangle(double sideA , double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getarea() {
        double area = sideA * sideB ;
        return area;
    }

    @Override
    public double getperimetr() {
        double perimetr = (sideA + sideB) * 2;
        return perimetr;
    }
}
