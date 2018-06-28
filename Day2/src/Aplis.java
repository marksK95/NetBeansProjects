/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class Aplis implements GeometriskaFigura {
public double radius;

public String krasa;

    @Override
    public double laukums() {
       return Math.PI * this.radius * this.radius;
    }

    @Override
    public String krasa() {
        return this.krasa;
    }

    @Override
    public double perimetrs() {
        return 2 * Math.PI * this.radius;
    }
    
   
}
