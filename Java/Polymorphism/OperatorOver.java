package Polymorphism;
public class OperatorOver {

     void operator(int s1, int s2){
        int s = s1 + s2;
        System.out.println(s);
    }

     void operator(String s1, String s2){
        String s = s1+s2;
        System.out.println(s);

    }

    OperatorOver(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        OperatorOver x = new OperatorOver();
        x.operator("sin", "dhu");
        x.operator(2, 3);

        
    }
    
}
