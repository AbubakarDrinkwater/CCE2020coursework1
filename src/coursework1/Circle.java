/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author m00561037
 */
public class Circle extends Shape2d{
     
    double Radius;
    public Circle(String name, double r) {
        super(name);
        Radius = r;
    }
    
     public double getArea() {
        double area = 3.14*Radius*Radius;
        return area;
    }

    
    public double getPerimeter() {
        double perimeter = 2*3.14*Radius;
        return perimeter;
    }
}
