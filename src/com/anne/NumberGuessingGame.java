package com.anne;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int result = ran.nextInt(101);
        int guess = -1;
        int count = 0;
        int[] nums = new int[50];
        while (guess != result) {
            System.out.println("Please enter a guess number between 0 and 100: ");
            guess = scan.nextInt();
            count++;
            nums[count] = guess;
            if (guess < result)
                System.out.println("too low");
            else if (guess > result)
                System.out.println("too high");
            else
                System.out.println("You got it " + guess);
        }
        System.out.println("Thanks for playing it took you " + count + " tries");
        for (int i = 0; i<=count; i++)
        System.out.println(+ nums[i]);







    }
}