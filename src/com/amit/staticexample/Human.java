package com.amit.staticexample;

public class Human {
    int age,salary;
    String name;
    static int population;
    Human(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.population+=1;
//        Human.population +=1;
    }

}
