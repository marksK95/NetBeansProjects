/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class Kvadrats implements GeometriskaFigura{
        public int malasGarums;
        
        public String krasa;
        
    @Override
    public double laukums() {
        return this.malasGarums * this.malasGarums;
    }

    @Override
    public String krasa() {
        return this.krasa;
    }

    @Override
    public double perimetrs() {
        return this.malasGarums * 4;
    }

     
}
