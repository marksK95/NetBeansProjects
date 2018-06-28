/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Uzdevumi {
    private static Scanner ievade = new Scanner(System.in);
    
    public static void Piemeri(){
        System.out.print("Ievadi valsti: ");
        String valsts = ievade.next().toLowerCase();
        
        switch(valsts){
            case "latvija":
                    System.out.println("Riga");
                    break;
                    case"Lietuva":
                    System.out.println("Viļņa");
                    break;
                    default:
                    System.out.println("Nezināma valsts:");
                    break;
                            
        }
        
        
    }
    public static void MasiviSaraksti(){
        int[] skaitluMasivs = new int [3];
        skaitluMasivs[0] = 5;
        skaitluMasivs[1] = 9;
        skaitluMasivs[2] = 1;
        
        int[] skaitluMasivs2 = {5, 9, 1};
        int masivaIeraksti = skaitluMasivs2.length;
        int tresaisSkaitlis = skaitluMasivs2[2];
        boolean irCetri = false;
        for(int skaitlis : skaitluMasivs2){
        System.out.println(skaitlis);
        if(skaitlis == 4){
            System.out.print("Skaitlis 4 ir masīvs");
            irCetri = true;
        }
        }
        //if(irCetri == false)
        //if(irCetri == true)
        if(!irCetri){
            System.out.print("Skaitlis 4 nav masīvā");
        }
        
        ArrayList<String> tekstaSaraksts = new ArrayList<String>();
                tekstaSaraksts.add("teksts1");
                tekstaSaraksts.add("teksts2");
                tekstaSaraksts.add("teksts3");
                int sarakstaIeraksti = tekstaSaraksts.size();
                String tresaisVards = tekstaSaraksts.get(2);
                for(String vards : tekstaSaraksts){
                    System.out.println(vards);
                }
    }
    
    public static void Kalkulators(){
        System.out.print("Ievadi 1.skaitli: ");
       int sk1 = ievade.nextInt();
       System.out.print("Ievadi darbību: ");
        char op1 = ievade.next().charAt(0);
        System.out.print("Ievadi 2.skaitli: ");
       int sk2 = ievade.nextInt();
        char op2 = ievade.next().charAt(0);
        System.out.print("Ievadi 3.skaitli: ");
       int sk3 = ievade.nextInt();
       
      double rezultats;
       if(op1 == '*' || op1 == '/'){
           rezultats = apreikins(sk1, sk2, op1);
           rezultats = apreikins(rezultats, sk3, op2);
       } else {
           rezultats = apreikins(sk2, sk3, op2);
           rezultats = apreikins(sk1, rezultats, op1);
       }
         System.out.print("Rezultats = " + rezultats);
           
        }
        private static double apreikins(double sk1, double sk2, char op){
           
            switch(op){
                case '*':
                    return sk1*sk2 ;                  
                case '/':
                    return sk1/sk2;
                case '+':
                    return sk1 +sk2;
                case '-':
                    return sk1-sk2;
                default:
                    return 0;
                    
                
            } 
            
            
    }
}
