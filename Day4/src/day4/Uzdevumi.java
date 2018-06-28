/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Uzdevumi {
    
    public String teksts = "";
    
   private static  Scanner input  = new Scanner(System.in);
   
   public static void NSkaitli(){
       
                  System.out.println("Ievadi N");
                  int n = input.nextInt();
                  
                  int sum = 0;
                  for (int i=1; i<=n;i++){
                      System.out.println(i);
                      sum += i;
       
       }
                  System.out.println("Summa = " + sum);
               
   }
   
   
   
   
   
   public static void IevadiNSkaitlus(){
       
       System.out.println("Ievada skaitu N");
       int N = input.nextInt();
       
      
       
       int sum = 0;
       for (int i=0; i<N ; i++){
            System.out.println("Ievada skaitli: ");
           sum += input.nextInt();
       }
       double vid = (double)sum/N;
       
       System.out.println("Summa = " + sum);
       System.out.println("Videja vētiba = " + vid);
   }
   
   
   public static void SkaitlisNKubi(){
       System.out.println("Ievadi skaitli N");
       int N = input.nextInt();
       
       
          for(int i=1; i<=N; i++)   {
             System.out.printf("%s = %s", i , i*i*i);
         }
   }
   
   
   
   
   
public static void  SkaitluNTrijsturis(){
    System.out.println("Rindu skaits N ");
    int rinda = input.nextInt();
    
    for(int i=1 ; i<=rinda ; i++){
        for(int z=1;z<= i; z++){
        System.out.print("*");
    }
    System.out.println();
    }
}   
   




   
   public static void SkaitluNRezgis(){
       System.out.println("Ievadi N:");
       int N = input.nextInt();
       
       for (int rinda=1;rinda<=N;rinda++){
           if(rinda % 2 == 0){
               
           
           for(int i=N; i>=N; i--){
               System.out.print(i);
           }
           }else{
               
           for(int i =1 ; i<= N; i++){
           System.out.print(i);
       }
       }
           System.out.println();
       }
   }
      
       
       
   
   
   
   
   
   
   public static void SkaitlaNPretejaSeciba(){
       System.out.println("Ievadi skaitli N:");
       int N = input.nextInt();
       
       for (){
           
       }
       
       
           System.out.println();
       }
           
       }
   

   
   

   

