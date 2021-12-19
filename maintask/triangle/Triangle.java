package com.teachmeskills.lesson_6.maintask.triangle;

import com.teachmeskills.lesson_6.maintask.figure.Figure;

public class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;
    double sperimetr;
    public Triangle(double sideA , double sideB , double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sperimetr = sperimetr;
    }
    @Override
    public double getperimetr() {
        double perimetr = sideA + sideB + sideC;
        return perimetr;
    }
    public double getSperimetr(){
        sperimetr = (sideA + sideB + sideC)/2;
        return sperimetr;
    }


    @Override
    public double getarea( ) {
        double area = Math.sqrt(sperimetr * (sperimetr - sideA) * (sperimetr - sideB) * (sperimetr - sideC));
        return area;
    }
}
