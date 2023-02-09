package com.amit.sigleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample se =  SingletonExample.getInstance();

        SingletonExample se2 =  SingletonExample.getInstance();

        SingletonExample se3 =  SingletonExample.getInstance();

//        all will contain the same instance reference
    }

}
