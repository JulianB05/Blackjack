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
public class Main {

    public static void main(String[] args) {

        //BlackjackKartenstapel stapel = new BlackjackKartenstapel();
        //System.out.println(stapel.toString());
        //BlackjackSpiel blackjackSpiel = new BlackjackSpiel();
        //blackjackSpiel.spieleConsole();
        
        BlackjackKartenstapel blackjackKartenstapel = new BlackjackKartenstapel();
        blackjackKartenstapel.stapelinitialisieren();
        System.out.println(blackjackKartenstapel.toString());
        blackjackKartenstapel.mischen();
        System.out.println(blackjackKartenstapel.toString());
    }
}
