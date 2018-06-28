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
public class Kvadrats {
    
    private double MalasaGarums;
    
    private String Krasa;

    public Kvadrats(){
        
    }
    public Kvadrats(double MalasaGarums, String Krasa) {
        this.MalasaGarums = MalasaGarums;
        this.Krasa = Krasa;
    }
    
    

    public double getMalasaGarums() {
        return MalasaGarums;
    }

    public void setMalasaGarums(double MalasaGarums) {
        this.MalasaGarums = MalasaGarums;
        
    }
      
    
                
    

    public String getKrasa() {
        return Krasa;
    }

    public void setKrasa(String Krasa) {
        this.Krasa = Krasa;
    }
    
   public double laukums(){
       return this.MalasaGarums * this.MalasaGarums ;
   }
        public double perimetrs(){
            return this.MalasaGarums * 4;
        }
   
    }
            
            

