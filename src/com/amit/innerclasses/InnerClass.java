package com.amit.innerclasses;

// Everything belongs to this class only, it does not belong to any other class.
// becuase it itself does not dependent on any other class.
public class InnerClass {
//  only inner classes can be static/ not static
//  outer can not be static

//    class SecondInner{
//        String name;
//        SecondInner(){
//            this.name = name;
//        }
//    }

//    now this class is not depedent on object of this class.

//     to run / use this class object of InnerClass class need not to be created.
    static class SecondInner{
        String name;
        SecondInner(String name){
            this.name = name;
        }
    }
//statics are resolved during compile time
    public static void main(String[] args) {
//      SecondInner inc = new SecondInnner();
//      This statement will give an error, because it ask who is your object./it depend on other class
//      now we can use this inner class by this statement
        SecondInner inc = new SecondInner("Amit gupta");
        SecondInner inc2 = new SecondInner("hi");
        InnerClass in = new InnerClass();

        System.out.println(inc.name);
    }
}
