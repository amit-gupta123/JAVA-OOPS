package com.amit.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box(5);
        System.out.println(
                "Box length "+b.length+","+
                " Box width "+b.width+","+
                " Box height "+b.height
        );

        WeightedBox wb = new WeightedBox();
//        whenever we create an object of derived class it calls derived class constructor and before
//        executing anything in that, it calls base class constructor. and then executes derived class constructor's
//        instructions.
        System.out.println(wb.height+" "+wb.weight);

        WeightedBox wb2 = new WeightedBox(10,1,2,3);
        System.out.println(
                        "Box weigth "+wb2.weight+","+
                        " Box length "+wb2.length+","+
                        " Box width "+wb2.width+","+
                        " Box height "+wb2.height
        );



    }
}
