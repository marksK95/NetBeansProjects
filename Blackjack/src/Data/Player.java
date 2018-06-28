/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class Player {
   private ArrayList<Card>  cards;
   
   
   // 1. konstruktors izveido tukšu sarakstu
   public Player(){
           cards = new ArrayList();
   }
   // 2. metode, kad iedod kārti spēlētājam
   public void giveCard(Card card){
       cards.add(card);
   }
   // 3. metode, kas nosaka, vai spēlētājam
   //    vajag vēl kārti
   public boolean needOtherCard(){
     return countPoints()<21;  
   }          
   // 4. metode, kas saskaita punktus spēlētājam
   public int countPoints(){
       int totalPoints = 0;
       int aceCount = 0;
       // 4.1 jāsaskaita max iespējamie
       // spēlētāja punkti
       for(Card card : cards){
           int value = card.getValue();
           totalPoints += value;
           // ja ir dūzis
           if(card.getValue() == 11){
               aceCount++;
           }
       }
       // 4.2 ja punktu skaits pārsniedz 21
       // un ir kāds dūzis, tad punktu skaitu
       // samazina par 10 un atgriež
       // pie punkta 4.2.
       while(totalPoints > 21 && aceCount > 0){
           totalPoints -= 10;
           aceCount--;
           
       }
       return totalPoints;
   }
}
