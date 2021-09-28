/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spieler;

import java.util.ArrayList;


/**
 *
 * @author Julian
 */
public class Spieler extends Person{
    
    private String nickname;
    private ArrayList<Karte.Karte> kartenInHand;

    public Spieler(String nickname, ArrayList<Karte.Karte> kartenInHand){
        
        this.nickname = nickname;  
        this.kartenInHand = kartenInHand;
    }
    
    public void nimmKarten(Karte.Karte k){
        
        kartenInHand.add(k);
    }
    
    public int zählePunkte(){
        
        int res = 0;
        int ass = 0;
        
        for (int i = 0; i < kartenInHand.size()-1; i++) {
            
            res = kartenInHand.get(i).getKartenwert();
            
            if (kartenInHand.get(i).getKartenwert() == 11) {
                    ass++;
            }
        }    
        if (res < 21) {
            
            return res - (10*ass);
        }
        else{
            
            return res;
        }  
    }
}
