/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karte;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Julian
 */
public class BlackjackKartenstapel implements Kartenstapel{

    protected ArrayList<Karte> karten;
    
    @Override
    public void mischen() {
        
        Random r= new Random();
        for (int i = 0; i < 100; i++) {
            
            int z1 = r.nextInt(52);
            int z2 = r.nextInt(52);
            Karte temp = karten.get(z1);
            karten.set(z1, karten.get(z2));
            karten.set(z1, temp);
        }   
    }
    
    public BlackjackKartenstapel(){
        
        karten = new ArrayList<>();
        
        for (Kartenfarbe farbe: Kartenfarbe.values()){
            
            for (Kartenwert wert: Kartenwert.values()){
                
                karten.add(new Karte(farbe,wert));
            }   
        }       
    }
    
    @Override
    public String toString(){
        String res="";
        for (int i = 0; i < karten.size(); i++) {
            res += karten.get(i).toString()+"\n";
        }
        return res;
    }
}
