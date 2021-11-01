package constructors;

public class Super {

    private Super(){
        this(2,3);
        System.out.println("default constructor");
    }

    Super(int i, int j){
        System.out.println("2 parameterized constructor");
    }

    Super(int i, String name,int j){
        this();  //when you want to call same class constructor , use this keyword
        System.out.println("constructor overloading");
    }

    void m2(){
        System.out.println("superclass method");
    }
    
}
class Test extends Super{

    int i =6;

    Test(){
        super(3, "ram", 8); //when you want to call parent class constructor, use super keyword
        System.out.println("subclass constructor");
    }

    void m1(){
        System.out.println("method");
    }


    
}
class Run{
    public static void main(String[] args) {
        Test x = new Test();
        x.m1();
        x.m2();
        
    }
}


