package com.amit.sigleton;
// Only one object can be created for singleton class
public class SingletonExample {
//    when we want only one object to be created, ideally we should not allow anyone to call the constructor
    private static SingletonExample instance;
    private SingletonExample() {

    }
    public static SingletonExample getInstance() {
//        whenever this function is called check wether only one objet is created or not.
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
