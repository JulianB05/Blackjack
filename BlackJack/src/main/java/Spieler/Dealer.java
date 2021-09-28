/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spieler;

import Karte.BlackjackKartenstapel;

/**
 *
 * @author Julian
 */
public class Dealer extends Spieler{
    
    private BlackjackKartenstapel stapel;
    
    public void gibKarte(Karte.Karte k){
        
        
        kartenInHand.add(k);
        
    } 
}
