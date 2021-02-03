package com.anne;

import java.awt.*;
import java.util.Date;

public class ReferenceType {

    public static void main(String[] args) {

        Date now = new Date();

        System.out.println(now);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);


    }
}
