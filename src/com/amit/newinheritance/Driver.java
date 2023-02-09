package com.amit.newinheritance;

public class Driver {
    public static void main(String[] args) {
        A sup = new A();
        B sub = new B();
        // sup is accessing everything from super class
        System.out.println("a and b in superclass");
        sup.show();
        // sub can access everything of its own and its parent also
        System.out.println("a,b and c in sub class without any change");
        sub.show();
        System.out.println("And their sum is");
        sub.sum();
        // accessing super class attributes from subclass object-
        // subclass have its own copy of inherited attributes not exactly referring to superclass attributes
        sub.a = 100;
        sub.b = 200;
        // verify here
        System.out.println(sup.a+" "+sup.b); // have whatever they are assigned in super class
        // subclass object can't access the attributes of the super class neither  alter them
        // subclass inherit them and have its own copy
        // can not alter their state
        // initial value of inherited attributes will be same as in parent class
        System.out.println("In subclass a and b after changing");
        System.out.println( sub.a + " " + sub.b);
    }
}
     