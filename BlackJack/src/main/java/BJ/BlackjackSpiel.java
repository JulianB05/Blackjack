package BJ;

import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Martin
 */
public class BlackjackSpiel {

    private Dealer dealer;
    private Spieler spieler;

    public BlackjackSpiel() {
        dealer = new Dealer("Dealer", "Alfons", "Trudeau", new Date(1999, 1, 1));
        spieler = new Spieler("Gustavus", "Gustav", "Monroe", new Date(2001, 1, 1));
    }
   
    public void gibKarteAnSpieler(){
        dealer.gibKarte(spieler);
    }
    public void dealerAmZug(){
        while (dealer.zählePunkte() <= spieler.zählePunkte()) {
            dealer.gibKarte(dealer);
        }
    }
   
    public Spieler ermittleSieger(){
        int sp= spieler.zählePunkte();
        int de = dealer.zählePunkte();
        if(sp>21)
            return dealer;
        else if(de>21)
            return spieler;
        else{
            if(sp>de)
                return spieler;
            else
                return dealer;
        }
    }
   
    public void entferneKarten(){
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
        while (weiter == 1 && spieler.zählePunkte() < 22) {
            dealer.gibKarte(spieler);
            spielerzahl = spieler.zählePunkte();
            if (spielerzahl > 21) {
                System.out.println("Dealer hat gewonnen, denn der Spieler hat "+spielerzahl +" Punkte");
                System.out.println(spieler.toString());
                return;
            }
            System.out.println(spieler.toString());
            weiter = Integer.parseInt(JOptionPane.showInputDialog("Noch eine Karte, dann 1 drücken, sonst 0"));
        }

        while (dealer.zählePunkte() < spieler.zählePunkte()) {
            dealer.gibKarte(dealer);
        }
        System.out.println(spieler.toString());
        System.out.println(dealer.toString());
        dealerzahl = dealer.zählePunkte();
        if (dealerzahl > 21) {
            System.out.println("Der Spieler hat gewonnen mit "+ spielerzahl+":"+dealerzahl);
        } else if (dealerzahl > spielerzahl) {
            System.out.println("Dealer hat gewonnen mit "+ dealerzahl+":"+spielerzahl);
        } else {
            System.out.println("Der Spieler hat gewonnen mit "+ spielerzahl+":"+dealerzahl);
        }
        dealer.entferneAlleKarten();
        spieler.entferneAlleKarten();
    }

}