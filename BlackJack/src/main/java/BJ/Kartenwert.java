/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;

/**
 *
 * @author Julian
 */
public enum Kartenwert {

    ZWEI(2),
    DREI(3),
    VIER(4),
    FUENF(5),
    SECHS(6),
    SIEBEN(7),
    ACHT(8),
    NEUN(9),
    ZEHN(10),
    BUBE(10),
    DAME(10),
    KOENIG(10),
    ASS(11);

    private int Zahlenwert;

    private Kartenwert(int wert) {

        Zahlenwert = wert;
    }

    public int getZahlenwert() {

        return Zahlenwert;
    }
}
