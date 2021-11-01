package Interface;

public interface PrivateInter {
    int i=10;

    public abstract void m1();

   public default void m2(){     
       m4();
       m5();              
        System.out.println("default method");
    }

    public static void m3(){
        m5();
        System.out.println("static method");
    }

    private void m4(){          //private non-static cannot be used inside private static methods
        System.out.println("private method");
    }

    private static void m5(){        //private static can be used inside other static and non-static interface methods
        System.out.println("private static method");
    }
}

class Custom implements PrivateInter{

    public void m1(){

        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        Custom x = new Custom();
        x.m1();
        x.m2();
        PrivateInter.m3();
    }
}







    
    

