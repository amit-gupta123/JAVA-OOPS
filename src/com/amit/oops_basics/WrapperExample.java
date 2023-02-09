package com.amit.oops_basics;
class Animal{
    int weight;
    int height;
//    final int tail; produce an error because it must be initialized
    final int tail = 1 ;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
//      this can also be done as
        Integer num = new Integer(30);
        System.out.println(num);
        System.out.println(num.byteValue());

        final int x = 10;
        // x = 12;

        Animal an = new Animal();
//        an.tail+=1;
//        since tail is of primitive type it can not be modified;
//        this happens only when data type is primitive
//        with reference type modification is allowed but reassignment is not allowed
          final Animal ani = new Animal();
          ani.height = 15;
          System.out.println(ani);
//        When a non primitive is final, you can not re-assign it.
//        for a reference type it's value can be changed but not reassigned.
        Animal anim = new Animal();
//        for (int i=0;i<100000000;i++){
//            anim = new Animal();
//        }

    }
}
