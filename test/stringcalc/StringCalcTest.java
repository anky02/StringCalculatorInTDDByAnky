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
    @Before
    public void init() {
        sc=new StringCalc();
    }
    @After
    public void destroy() {
        sc = null;
    }
    @Test
    public void testEmptyString() {
        assertEquals(sc.add(""),0);
    }
    @Test
    public void testAddOneNumber() {
        assertEquals(sc.add("1"),1);
    }
    @Test
    public void testTwoNumber() {
        assertEquals(sc.add("1,2"),3);
    }
    @Test
    public void testMultipleNumber() {
        assertEquals(sc.add("2566,33,44,55,50,44,100,550"),2566+33+44+55+50+44+100+550);
    }
    @Test
    public void testNewLine() {
        assertEquals(sc.add("1\n2,3"),1+2+3);
        
    }
    @Test
    public void testOtherDelimeter() {
        assertEquals(sc.add("//;\n1;2;3"),1+2+3);
    }
    @Test
    public void testNegativeNumber() {
        try{
            sc.add("-1,2");
        }catch(IllegalArgumentException e){
           assertEquals(e.getMessage(),"Negatives not allowed: -1");
        }
        try{
            sc.add("1,2,-3,4,-5");
        }catch(IllegalArgumentException e){
           assertEquals(e.getMessage(),"Negatives not allowed: -3,-5");
        }
    }
    
}
