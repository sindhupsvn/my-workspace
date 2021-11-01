package Polymorphism;

public class ride {

    int j=20;

    void m1(){
        System.out.println("method1");
    }

    ride(){
        System.out.println("constructor");
    }
    
}
class riding extends ride{

    riding(){
        super();
        System.out.println("sub class constructor");
    }

    void m1(){
        System.out.println("method overriding");
    }

    public static void main(String[] args) {
        
    
    riding x = new riding();
    x.m1();
    


}
}
