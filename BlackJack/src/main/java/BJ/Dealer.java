/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Julian
 */
public class Dealer extends Spieler{
    
    protected BlackjackKartenstapel stapel;
    
    public Dealer(BlackjackKartenstapel stapel, String nickname, String name, String nachname, Date geburtsdatum){
       
        super(nickname, name, nachname, geburtsdatum);
        this.stapel = stapel;  
        this.kartenInHand = new ArrayList<>();
    }
    
    public void gibKarte(Spieler s){
        
        s.nimmKarten(stapel.karten.get(0));
        stapel.karten.remove(0);
        
    } 
}
