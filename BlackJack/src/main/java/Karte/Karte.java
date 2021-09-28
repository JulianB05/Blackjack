/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karte;

/**
 *
 * @author Julian
 */
public class Karte {
    
    private Kartenfarbe farbe;
    private Kartenwert wert;
    
    public Karte(Kartenfarbe farbe, Kartenwert wert){
        
        this.farbe = farbe;
        this.wert = wert;
    }
    
    public int getKartenwert(){
        
        return wert.getZahlenwert();
    }
    @Override
    public String toString(){
        return wert+"-"+farbe;
    }
}
