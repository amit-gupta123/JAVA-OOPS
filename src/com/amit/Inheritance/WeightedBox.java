package com.amit.Inheritance;

public class WeightedBox extends Box{
    double weight;

    WeightedBox(){
        System.out.println("from derived");
        this.weight = -4.5;
    }

    WeightedBox(double weight, double height, double length, double width){
                super(length,height,width);
                this.weight=weight;
    }


}
