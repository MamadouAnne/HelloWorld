package com.anne;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("input: ");
            input = scn.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
                System.out.println(input);
        }
    }
}
