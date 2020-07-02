package com.bp.unitttest;

import java.util.List;

public class MyUtils {

    public static int summation(List<Integer> numbers){
        int sum = 0;
        for (Integer num : numbers) {
            sum +=num;
        }
        return sum;
    }
}
