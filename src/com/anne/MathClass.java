package com.anne;

public class MathClass {
    public static void main(String[] args) {

        int result1 =  Math.round(1.4F); // will round the number with no decimal part
        System.out.println(result1);
        int result2 = (int)Math.ceil(1.1F); // next greatest integer (2)
        System.out.println(result2);
        int result3 = (int)Math.floor(1.9F); // will output smallest integer
        System.out.println(result3);
        int result4 = Math.max(1,2); // will return the greater number
        System.out.println(result4);
        int result5 = Math.min(1,2); // will return smallest number
        System.out.println(result5);
        double result6 = Math.random()*100; // will return a random number between 0 and 100
        int x =  (int)Math.round(Math.random()*100);
        System.out.println(result6);
        System.out.println(x);
    }
}
