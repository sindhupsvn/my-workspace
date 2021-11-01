package Abstraction;

public abstract class First {

    abstract void m1();

    void m2(){
        System.out.println("non-abstract method");
    }
    
    First(){
        System.out.println("constructor");
    }

}

class Second extends First{

    void m1(){
        System.out.println("implementing abstract method");
    }

    public static void main(String[] args) {
        Second x = new Second();
        x.m2();
    }

}


