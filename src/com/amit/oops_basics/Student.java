package com.amit.oops_basics;

public class Student {
    private int rollNumber;
    private String name;

    Student(){
        // calling one constructor from other
        // new student(name, rollnumber);
        this("Amit gupta",11804163);//internally: new Student(name,rno);
        System.out.println("Default constructor is called");
    }

    Student( String name, int rollNumber ){
        System.out.println("parametrised constructor is called");
        this.rollNumber = rollNumber;// this just contain the address of object which called this constructor.
        this.name = name;
    }
    // we can also pass an object to a constructor.
    Student(Student other){
        this.name = other.name;
        this.rollNumber = other.rollNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
}
