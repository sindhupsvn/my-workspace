package Interface;

public interface Seventh {

    void m1();            //second package = seven
    
    default void m2(){
        System.out.println("default method");
    }
    
}
