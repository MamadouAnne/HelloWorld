package com.anne;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = {3,2,7,4,8};

        Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
