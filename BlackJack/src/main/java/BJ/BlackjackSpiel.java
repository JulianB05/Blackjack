package BJ;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class BlackjackSpiel{

    protected Dealer dealer;
    protected Spieler spieler;
    //private BlackjackSpiel hintergrundspiel;

    public BlackjackSpiel() {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler("Gustavus", "Gustav", "Monroe", new Date(2001, 1, 1));    
    }
    public BlackjackSpiel(String nickname, String name, String nachname, Date geburtsdatum) {
        
        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(nickname, name, nachname, geburtsdatum);       
    }
    public BlackjackSpiel(String nickname, String name, String nachname, Date geburtsdatum, int geld) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(nickname, name, nachname, geburtsdatum);  
    }
    public BlackjackSpiel(String nickname, String name, String nachname, int geld) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(nickname, name, nachname, geld);  
    }
    public BlackjackSpiel(String nickname, String name, String nachname) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(nickname, name, nachname);  
    } 
    public BlackjackSpiel(String name, String nachname, Date geburtsdatum) {
        
        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(name, nachname, geburtsdatum);  
    }
    public BlackjackSpiel(String name, String nachname, Date geburtsdatum, int geld) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(name, nachname, geburtsdatum, geld);  
    }
    public BlackjackSpiel(String name, String nachname, int geld) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(name, nachname, geld);  
    }
    public BlackjackSpiel(String name, String nachname) {

        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler(name, nachname);  
    }

    public void gibKarteAnSpieler() {

        dealer.gibKarte(spieler);
    }

    public void dealerAmZug() {

        while (dealer.z??hlePunkte() <= spieler.z??hlePunkte()) {
            dealer.gibKarte(dealer);
        }
    }

    public Spieler ermittleSieger() {

        int sp = spieler.z??hlePunkte();
        int de = dealer.z??hlePunkte();
        if (sp > 21) {
            return dealer;
        } else if (de > 21) {
            return spieler;
        } else {
            if (sp > de) {
                return spieler;
            } else {
                return dealer;
            }
        }
    }

    public void entferneKarten() {

        spieler.entferneAlleKarten();
        dealer.entferneAlleKarten();
    }

    public Dealer getDealer() {

        return dealer;
    }

    public Spieler getSpieler() {

        return spieler;
    }

    public void spieleConsole() {

        int weiter = 1;
        int spielerzahl = 0;
        int dealerzahl = 0;
        while (weiter == 1 && spieler.z??hlePunkte() < 22) {
            dealer.gibKarte(spieler);
            spielerzahl = spieler.z??hlePunkte();
            if (spielerzahl > 21) {
                System.out.println("Dealer hat gewonnen, denn der Spieler hat " + spielerzahl + " Punkte");
                System.out.println(spieler.toString());
                return;
            }
            System.out.println(spieler.toString());
            weiter = Integer.parseInt(JOptionPane.showInputDialog("Noch eine Karte, dann 1 dr??cken, sonst 0"));
        }

        while (dealer.z??hlePunkte() < spieler.z??hlePunkte()) {
            dealer.gibKarte(dealer);
        }
        System.out.println(spieler.toString());
        System.out.println(dealer.toString());
        dealerzahl = dealer.z??hlePunkte();
        if (dealerzahl > 21) {
            System.out.println("Der Spieler hat gewonnen mit " + spielerzahl + ":" + dealerzahl);
        } else if (dealerzahl > spielerzahl) {
            System.out.println("Dealer hat gewonnen mit " + dealerzahl + ":" + spielerzahl);
        } else {
            System.out.println("Der Spieler hat gewonnen mit " + spielerzahl + ":" + dealerzahl);
        }
        dealer.entferneAlleKarten();
        spieler.entferneAlleKarten();
    }

}
