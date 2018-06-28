/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HOME
 */
public class Deck {
        private ArrayList<Card> cards;
    
        private String[] values = {"2","3","4","5","6"
                                  ,"7","8","9","10"};
           private char[] suits 
                              = {'H', 'S', 'C', 'D'};
    
    //1. konstruktors, kas izveido sarakstu ar kārtīm
    public Deck(){
        this.cards = new ArrayList();
        
        for(char suit : suits){
            for(String value : this.values){
                this.cards.add(new Card(suit, value));
            }
        }
    }
    
    //2. sajauc kāršu sarakstu
    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    //3. paņem vienu kārti, dzēš no saraksa un atgriež
    public Card takeCard(){
        Card lastCard = this.cards.get(cards.size() -1);
        cards.remove(lastCard);
        
        return lastCard;
   }
}
