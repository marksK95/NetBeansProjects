/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author HOME
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    static void Kvadrats(){
       Square s1 = new Square(5);
       s1.perimeter();
       s1.area(); 
    }
    
    static void Taisnasturis(){
    Rectangle r1 = new Rectangle(5, 2);
    r1.perimeter();
    r1.area();
    }
    static void Trissturis(){
    Triangle t1 = new Triangle(5, 3, 4);
    t1.perimeter();
    t1.area();
    }
    static void Pentagon(){
    Pentagon p1 = new Pentagon(5);
    p1.perimeter();
    p1.area();
    }
}
