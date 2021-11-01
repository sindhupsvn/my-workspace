package Inheritance;

public class Hier {

    int i=50;
    int j=60;

    void m4(){
        System.out.println("method4");
    }
}
class Heir1 extends Hier{

    void m5(){
        System.out.println("method5");
    }
}
class Heir2 extends Hier{

    void m6(){
        System.out.println("method6");
    }
}
class Test{
    public static void main(String[] args) {
        
        Heir2 x = new Heir2();
        x.m4();
        x.m6();
        
        

    }
}