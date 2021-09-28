/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spieler;

import java.util.Date;

/**
 *
 * @author Julian
 */
public class Person {
    
    private String name;
    private String nachname;
    private long geburtsdatum;
    
    public Person(String name, String nachname, Date geburtsdatum){
    
        this.name = name;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum.getTime();
    }
    
}


