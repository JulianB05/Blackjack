/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Julian
 */
public class BlackjackKartenstapel implements Kartenstapel {

    protected ArrayList<Karte> karten;

    public BlackjackKartenstapel() {
        karten = new ArrayList<>();
        stapelinitialisieren();
        mischen();
    }

    public void mischen() {

        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int rand = r.nextInt(karten.size());
            Karte safe =  karten.get(rand);
            int rand2 = r.nextInt(karten.size());
            karten.set(rand, karten.get(rand2));
            karten.set(rand2, safe);
        }
    }

    public void stapelinitialisieren() {

        karten = new ArrayList<>();

        for (Kartenfarbe farbe : Kartenfarbe.values()) {

            for (Kartenwert wert : Kartenwert.values()) {

                karten.add(new Karte(farbe, wert));
            }
        }
    }

    @Override
    public String toString() {

        String res = "";
        for (int i = 0; i < karten.size(); i++) {
            res += karten.get(i).toString() + "\n";
        }
        return res;
    }
}
