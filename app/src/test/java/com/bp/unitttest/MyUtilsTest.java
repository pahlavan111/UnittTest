package com.bp.unitttest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyUtilsTest {

    @Test
    public void summation() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        int actualNumber = MyUtils.summation(numbers); //expect that output = 14 if this is not the case,
                                //so sure there will be a problem and we need to go back and fix the summation method
        int expected = 14;
        assertEquals(expected, actualNumber);

        
    }
}