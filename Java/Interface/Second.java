package Interface;
public interface Second{
    int i=10;
    void n1();
    default void n2(){
        System.out.println("default method");

   }

   static void n3(){
       System.out.println("static method");
   }
   
   class Banana{

    void n4(){
        System.out.println("inner class");
    }
}

    interface Ayoo {
        int b =3;
       
        void d1();
}

   

}

class Orange implements Second{

   public void n1(){
        System.out.println("implementing abstract method");
    }

    void d1(){
        System.out.println("abstract");
    }

    public static void main(String[] args) {
        Orange x = new Orange();
        x.n1();
        x.n2();
        Second.n3();
        System.out.println(x.i);
        Banana y = new Banana();  //implementing inner class
        y.n4();
       System.out.println(Ayoo.b);
       x.d1();
       

        
    }

    
}