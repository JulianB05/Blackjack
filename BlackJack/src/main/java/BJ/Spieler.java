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
public class Spieler extends Person {

    protected String nickname;
    protected ArrayList<Karte> kartenInHand = new ArrayList<>();

    public Spieler(String nickname, String name, String nachname, Date geburtsdatum) {

        super(name, nachname, geburtsdatum);
        this.nickname = nickname;
        this.kartenInHand = kartenInHand;
    }

    public void nimmKarten(Karte k) {
        kartenInHand.add(k);
    }

    public int zählePunkte() {

        int result = 0;
        int AnzahlAsse = 0;
        for (Karte K : kartenInHand) {
            if (K.getKartenwert() == 11) {
                AnzahlAsse++;
            }
            result += K.getKartenwert();
        }
        if (result > 21 && AnzahlAsse != 0) {
            for (int i = 0; i < AnzahlAsse; i++) {
                result -= 10;
            } 
        }
        return result;
    }

    public void entferneAlleKarten() {

        kartenInHand.clear();
    }

    public ArrayList<Karte> getKartenInDerHand() {
        return kartenInHand;
    }

    @Override
    public String toString() {
        return "Spieler{" + "nickname=" + nickname + ", kartenInHand=" + kartenInHand + '}' + super.toString();
    }

    public String getNickname() {
        return nickname;
    }

    
    
    

}
