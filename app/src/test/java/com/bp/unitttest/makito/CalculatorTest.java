package com.bp.unitttest.makito;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator c = null;

    @Before          // this annotation means this method runs before all method
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(5, c.add(2, 3));
    }

}