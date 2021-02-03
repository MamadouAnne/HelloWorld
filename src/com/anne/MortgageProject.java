package com.anne;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageProject {
    final static byte MONTH_IN_YEAR = 12;
    final static short PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal:", 1000, 1_000_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterestRate, years);
        printPaymentSchedule(principal, annualInterestRate, years);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculatedMortgage(principal, annualInterestRate, years);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Payments: " + formattedMortgage);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (short month = 1; month <= years * MONTH_IN_YEAR; month++) {
            double balance = calculatedBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double calculatedBalance
            (int principal,
             float annualInterestRate,
             byte years,
             short numberOfPaymentMade) {
        int numberOfPayments = years * MONTH_IN_YEAR;
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEAR;
        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }


    public static double readNumber(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(message);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("please enter a number between " + min + " and " + max);
        }
        return value;
    }

    public static double calculatedMortgage
            (int principal,
             float annualInterestRate,
             byte years) {
        int numberOfPayments = years * MONTH_IN_YEAR;
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEAR;
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String calculatedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        return mortgage;
    }
}
