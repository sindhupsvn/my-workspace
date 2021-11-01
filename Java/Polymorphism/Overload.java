package Polymorphism;
public class Overload {

    static int add(int a, int b){
        return a+b;
    }                                   //changing number of arguments
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
class Load{
    public static void main(String[] args) {
      System.out.println(Overload.add(2, 3));
      System.out.println(Overload.add(1, 2, 3));
        
    }
}
