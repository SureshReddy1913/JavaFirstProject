package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{

    public void testEvenOddNumber1(){
        CheckEven ch = new CheckEven();
        assertEquals("10 is a even number", true, ch.check(10));    
    }
    public void testEvenOddNumber2(){
        CheckEven ch = new CheckEven();
        assertEquals("11 is a even number", false, ch.check(11));
    }
    public void testEvenOddNumber3(){
        CheckEven ch = new CheckEven();
        assertEquals("12 is a even number", true, ch.check(12));
    }
    
}
