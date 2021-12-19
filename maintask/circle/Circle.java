package com.teachmeskills.lesson_6.maintask.circle;

import com.teachmeskills.lesson_6.maintask.figure.Figure;

public class Circle extends Figure {
    static double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getarea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public  double getperimetr() {
        double perimetr = Math.PI * 2*radius;
        return perimetr;
    }
}
