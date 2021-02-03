package com.anne;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("you are " + name);
    }
}
