package Inheritance;

public class Multi {

    int i=8;
    int j=10;

    void n1(){
        System.out.println("method1");
    }

    void m2(){
        System.out.println("method2");
    }
    
    void m3(){
        System.out.println("method3");
    }

    
}
class Lev extends Multi{

    void m4(){
        System.out.println("method4");
    }

    int k =60;
}


class Elsa extends Lev{
    public static void main(String[] args) {

    Elsa x = new Elsa();
    System.out.println(x.i);
    System.out.println(x.j);
    x.m3();
    



}
}
