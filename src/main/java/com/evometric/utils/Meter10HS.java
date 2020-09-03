package com.evometric.utils;

/**
 * Meter 10HS functions
 *
 */
public class Meter10HS
{
    public double equation2(int millivolts)
    {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    /**
     * Using equation4 on page 11 of the Meter 10HS manual, derive VWC readings from output mV
     * @param millivolts
     * @return
     */
    public double equation4(int millivolts)
    {
        //equation
        return ((2.97 * Math.pow(10,-9)) * (Math.pow(millivolts,3))) -
                ((7.37 * Math.pow(10,-6)) * (Math.pow(millivolts,2))) +
                ((6.69 * Math.pow(10,-3)) * (millivolts)) - 1.92;

    }
}
