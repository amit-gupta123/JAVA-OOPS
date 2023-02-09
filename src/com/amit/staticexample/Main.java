package com.amit.staticexample;
// if two fiels are in same folder then need not to import
// common properties are declared as static/ not different for every object
public class Main {

    public static void main(String[] args) {
        Human h = new Human("Amit gupta",22,4300);
        // the static properties actually belong to  class not to a particular object
        // static properties can be accessed by class name itself and also with reference obj.
        // greeting();
        // It will give error because nothing that is non static can be accessed from static method;
        // Because non static data belongs to a class; not to an object
        // if main does not depend on instances then we can not have something in it that depend on instances.

    }

    /*
Question: Why the main is Static?
Answer: Main is the very first thing which run whenever you try to run a java program.
        Static means, we can use this static variable/method without creating object of that class.
        In order to run anything that is inside that class you have to create object of that class.
        If main is not there a java program can not run.
        We can not run a program to create an object if main is the very first thing that run.
        Hence main should be runnable without creating an object of class. so it must be declared static.
    */
/*      this is going to be have by an instance, without knowing which instance we are talking about
        we can not call this method from main without creating object */

    static void printHi(){
        System.out.println("static method can be called form non static method ");
    }
    void greeeting(){
        System.out.println("Non static method belongs to an object");
        printHi();
    }
}
