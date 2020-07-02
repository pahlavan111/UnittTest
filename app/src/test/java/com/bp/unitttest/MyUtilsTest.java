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


        numbers.clear();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        expected= 10;
        actualNumber = MyUtils.summation(numbers);
        assertEquals("something went wrong",expected,actualNumber);
    }


    @Test
    public void mAverage(){

        int[] numbers = {5,6,4};
        float expected = 5.0f;
        float actual = MyUtils.average(numbers);
        assertEquals(expected,actual,0.1); // یک بازه برای اینکه تا این حد فرق بکنه اشکال نداره در نظر میگیریم :delta

    }

}