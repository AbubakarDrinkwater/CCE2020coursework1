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
public class Sphere extends Shape3d{
    
        double Radius;
    
        public Sphere(String name, double radius) {
        super(name);
        this.Radius = radius;
    }

    @Override
    public double getSa() {
        double area = 4 * 3.14 * Radius * Radius;
        return area;
    }

    @Override
    public double getVolume() {
        double volume = 4 * 3.12 * Radius * Radius * Radius;
        return volume;
    }

     
    
}
