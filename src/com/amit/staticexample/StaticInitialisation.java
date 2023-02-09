package com.amit.staticexample;

import java.sql.SQLOutput;

// This is demo to show how to initialise static variables
public class StaticInitialisation {
    static  int a = 10;
    static int b;
//     we can initialise a static variables using static block
//     it will only run once when first object is created, when class is loaded
    static {
    System.out.println("I am in static");
    b = a+5;
    }
    public static void main(String[] args) {
        StaticInitialisation si = new StaticInitialisation();
        System.out.println(si.a+" "+si.b);
        si.b+=6;
        System.out.println(si.a+" "+si.b);
        StaticInitialisation si2 = new StaticInitialisation();
        System.out.println(si2.a+" "+si2.b);
    }
}
