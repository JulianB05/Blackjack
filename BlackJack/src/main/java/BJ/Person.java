/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;

import java.util.Date;

/**
 *
 * @author Julian
 */
public class Person {

    protected String name;
    protected String nachname;
    protected long geburtsdatum;

    public Person(String name, String nachname, Date geburtsdatum) {

        this.name = name;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum.getTime();
    }
    public Person(String name, String nachname) {

        this.name = name;
        this.nachname = nachname;
        this.geburtsdatum = new Date().getTime(); 
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", nachname=" + nachname + ", geburtsdatum=" + geburtsdatum + '}';
    }
    
    

}
