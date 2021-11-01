package Inheritance;

public class Inherit {
    int i=10;

    static int j;
    {
        j=8;
    }


   void m1(){
        System.out.println("method1");
    }

    void m2(){
        System.out.println("method2");
    }

    Inherit(){
        System.out.println("constructor2");
    }
private int k;
public int getK(){       //used getter and setter methods
    return k;
}

public void setK(int k){
    this.k =k;
}

static void m7(){
    System.out.println("static method");
}

 
    

}

class Ram extends Inherit{

    void m3(){
        System.out.println("method3");
    }

    Ram(){         
        super();           //accessing super class constructor by using super keyword
        System.out.println("constructor");
    }

    static void m7(){                         //overriding static method called data hiding
        System.out.println("static method1");
    }

    void m2(){
        System.out.println("method9");
    }

    
       


   

    public static void main(String[] args) {
        Ram x = new Ram();
        System.out.println(x.i);
        x.m3();
        x.m2();
        System.out.println(Inherit.j);
        x.setK(5);
        System.out.println(x.getK());
        
        
        
    }
}
