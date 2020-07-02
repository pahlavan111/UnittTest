package com.bp.unitttest;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.List;

public class MyUtils {

    public static int summation(List<Integer> numbers){
        int sum = 0;
        for (Integer num : numbers) {
            sum +=num;
        }
        return sum;
    }


    public static float average (@NotNull int[] integerArray ){

        int sum = 0;
        for (Integer num :
                integerArray) {
            sum +=num;
        }

        return (float) (sum / integerArray.length);
    }

}
