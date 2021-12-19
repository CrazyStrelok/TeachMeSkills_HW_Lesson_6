package com.teachmeskills.lesson_6.maintask.test;

import com.teachmeskills.lesson_6.maintask.circle.Circle;
import com.teachmeskills.lesson_6.maintask.rectangle.Rectangle;
import com.teachmeskills.lesson_6.maintask.triangle.Triangle;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
        Circle circle1 = new Circle(2.3);
        Triangle triangle = new Triangle(1.2  ,2.1 , 1.2);
        Rectangle rectangle = new Rectangle(1.2,2.2);
        Rectangle rectangle1 = new Rectangle(2.3 , 3.4);
        double [] array = new double [5];
        array [0] = circle.getperimetr();
        array[1] = circle1.getperimetr();
        array[2] = triangle.getperimetr();
        array [3] = rectangle.getperimetr();
        array[4] = rectangle1.getperimetr();
        double sum = 0;
        for (double element : array)
            sum += element;
        System.out.println(sum);
    }
}
