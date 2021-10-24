/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ankit
 */
public class StringCalcTest {
    StringCalc sc;

    /**
     * Test of main method, of class StringCalc.
     */
    @Test
    public void testMain() {
        sc=new StringCalc();
        assertEquals(sc.add(""),0);
        assertEquals(sc.add("1"),1);
        assertEquals(sc.add("2"),2);
        assertEquals(sc.add("2566,33,44,55,50,44,100,550"),2566+33+44+55+50+44+100+550);
    }
    
}
