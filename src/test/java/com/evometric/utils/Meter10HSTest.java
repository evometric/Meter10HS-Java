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
        assertTrue( meter10HS.equation4(300) == -0.49610999999999983 ); // see page 7
        assertTrue( meter10HS.equation4(1250) == 0.7276562500000017 ); // see page 7

        //testing the test
        //System.out.println(meter10HS.equation4(1250));
    }
}
