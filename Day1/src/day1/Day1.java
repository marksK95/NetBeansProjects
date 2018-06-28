/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author HOME
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kvadrats kv1;
        
        kv1 = new Kvadrats(); //kv1 = Kvadrats klases objektu
        
        kv1.setMalasaGarums(5.5);
        kv1.setKrasa("Sarkans");
        double laukums = kv1.laukums();
        double perimetrs = kv1.perimetrs();
        
        Kvadrats kv2 = new Kvadrats (6, "melns");
        laukums = kv2.laukums();
        perimetrs = kv2.perimetrs();
        
        System.out.println("Kvadrata 1 laukums = " + laukums);
        System.out.println("Kvadrata 1 laukums = " + perimetrs);
        System.out.println("Kvadrata 1 laukums = " + kv1.getKrasa());
        
        
        
        
        
        Auto auto = new Auto();
        Lidmasina lidmasina = new Lidmasina();
        //auto.parviatoties();
        //lidmasina.parviatoties();
        parvietot(auto);
        parvietot(lidmasina);
        
        
        Direktors d = new Direktors();
        d.uzvards = "Liepiņš";
        d.vards = "Jānis";
       // System.out.println(d.toString());
        darbiniekaVards(d);
        
    }
    static void darbiniekaVards(Darbinieks d){
        System.out.println(d.toString());
    }
    
    static void parvietot(Transports tr){
        tr.parviatoties();
    }
}
