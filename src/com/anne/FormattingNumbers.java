package com.anne;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(155265.564);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);
    }
}
