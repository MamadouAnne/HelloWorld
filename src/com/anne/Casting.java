package com.anne;

public class Casting {

    public static void main(String[] args) {
        //implicit casting (no data lost)
        // byte --> short --> int --> long --> float --> double

        short x = 1;
        int y = x +2;
        System.out.println(y);

        // explicit casting
        double a = 1.1;
        int b = (int)a +2;
        System.out.println(b);

        // converting a string to an integer
        String c = "3";
        int d = Integer.parseInt(c) +2;
        System.out.println(d);
    }
}
