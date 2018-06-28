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
public class KravasAuto extends TransportLidzeklis {
    double ietilpiba;
    
    
    public KravasAuto(String razotajs, String marka, int gads, double ietilpiba){
        
        super(razotajs, marka, gads);
        
        
        this.ietilpiba = ietilpiba;
    }

    @Override
    public String toString() {
        String teksts = super.toString();
        teksts +=", ietilpiba = " + this.ietilpiba;
        
        return teksts;
        //vai
        /*return String.format("%, ietilpiba = %"
                , super.toString()
                , this.ietilpiba);*/
    }
    
}
