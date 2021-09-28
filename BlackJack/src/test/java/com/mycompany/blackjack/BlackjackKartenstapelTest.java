/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

import Karte.BlackjackKartenstapel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Julian
 */
public class BlackjackKartenstapelTest {
    
    public BlackjackKartenstapelTest() {
    }

    /**
     * Test of mischen method, of class BlackjackKartenstapel.
     */
    @Test
    public void testMischen() {
        System.out.println("mischen");
        BlackjackKartenstapel instance = new BlackjackKartenstapel();
        instance.mischen();
       
    }

    /**
     * Test of toString method, of class BlackjackKartenstapel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BlackjackKartenstapel instance = new BlackjackKartenstapel();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
