/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;
//public static scanner
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Day2_Ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vardaIevade();
    }
        // TODO code application logic here
        /*Scanner ievade = new Scanner(System.in);
        
        System.out.print("Ievada skaitli: ");
        
        int skaitlis = ievade.nextInt();
        
        System.out.println("Tu ievadiji skaitli " + skaitlis);*/
        
        static void vardaIevade(){
           Scanner ievade = new Scanner(System.in);
            System.out.print("Ievadi Vardu: ");
        String vards = ievade.next();
       
        System.out.print("Ievadi Uzvardu: ");
        String uzvards = ievade.next();
        
        System.out.printf("Tevi sauc % %\n", vards, uzvards);
       }
        
        static void gradi(){
           Scanner ievade = new Scanner(System.in); 
           System.out.print("Ievadi grādus: ");
        String gradi = ievade.next();
       
        System.out.print("Ievadi mērvienības: ");
        char merv = ievade.next().charAt(0);
        
        merv = Character.toUpperCase(merv) == 'F';
        if(merv == 'F'){
            System.out.println((gradi - 32) / 1.8 + "C");
            
        } else if (merv == "C"){
            double rezultatsF = gradi * 1.8 +32;
            System.out.println(rezultatsF + "F");
            
        } else {
            System.out.println("Nezināma mērvienība");
        }
       // if(merv2.equalsIgnoreCase("F"))
        
        }
        
        
        
    }
    

