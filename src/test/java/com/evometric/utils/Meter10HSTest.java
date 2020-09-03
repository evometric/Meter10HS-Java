package com.evometric.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Meter10HSTest
{
    /**
     * Test 10HS VWC calibration for mV inputs
     */
    @Test
    public void testEquation2()
    {
        final Meter10HS meter10HS = new Meter10HS();
        assertTrue( meter10HS.equation4(300) == -0.49610999999999983 );
        assertTrue( meter10HS.equation4(1250) == 0.7276562500000017 );

        //Test using 1250 milivolts Wolframalpha
        //https://www.wolframalpha.com/input/?i=%282.97*10%5E-9%29%281250%5E3%29-%287.37*10%5E-6%29%281250%5E2%29%2B%286.69*10%5E-3%29%281250%29-1.92

        //Test using 300 milivolts on Wolframalpha
        //https://www.wolframalpha.com/input/?i=%282.97*10%5E-9%29%28300%5E3%29-%287.37*10%5E-6%29%28300%5E2%29%2B%286.69*10%5E-3%29%28300%29-1.92
        //System.out.println(meter10HS.equation4(1250));

    }
}
