package com.anne;

public class IfStatements {
    public static void main(String[] args) {

        int temp = 40;
        if (temp>30) {
            System.out.println("it's a hot day");
            System.out.println("drink some water");
        }
        else if (temp>20)
            System.out.println("it's a nice day");
        else {
            System.out.println("it's cold");
        }
        // simplified if statement
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        // ternary operator
        String className = income >100_000 ? "First" : "Economy";


        System.out.println(className);





    }
}
