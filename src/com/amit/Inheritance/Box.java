package com.amit.Inheritance;

public class Box {
    double length;
    double width;
    double height;
//    defining constructor
    Box (){
        System.out.println("from base");
        this.length = -1;
        this.width  = -1;
        this.height = -1;
    }
//    when box is cube

    Box(double side){
        this.length = side;
        this.height = side;
        this.width  = side;
    }

//    when three diffrent paramters are given;
    Box(double length, double height, double width){
        this.length = length;
        this.width = width;
        this.height = height;
    }
//    copy constructor
    Box(Box b){
        this.length = b.length;
        this.width = b.width;
        this.height = b.width;
    }

    public void information(){
        System.out.println("This is information");
    }

}
