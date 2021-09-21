/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

/**
 *
 * @author Julian
 */

public enum Kartenwert{
        
    Zwei(2),
    Drei(3),
    Vier(4),
    Fünf(5),
    Sechs(6),
    Sieben(7),
    Acht(8),
    Neun(9),
    Zehn(10),
    BUBE(10),
    DAME(10),
    KÖNIG(10),
    ASS(11);
    
    private int Zahlenwert;
    
    public int getZahlenwert(){
        return Zahlenwert;
    }
    private Kartenwert(int wert){
        Zahlenwert = wert;
    }
}
  

