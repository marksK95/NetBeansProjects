/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author HOME
 */
public class TransportLidzeklis {
    String razotajs;
    String marka;
    int gads;
    public TransportLidzeklis(String razotajs, String marka, int gads){
        this.razotajs = razotajs;
        this.marka = marka;
        this.gads = gads;
                
    }
    
    public String toString(){
        return String.format("razotajs = %, marka= %, gads = %"
                ,razotajs
                ,marka
                ,gads);
    }
        
}
