package Polymorphism;
public class overload1 {

    void  add(int a, int b){
       int c = a+b;
        System.out.println(c);
    }

    void multiply(byte a, byte b){   //changing data type 
        byte c = (byte) (a*b);   //using byte method
        System.out.println(c);
        System.out.println("sindhu");
    }
    
}

class Tea extends overload1{
    public static void main(String[] args) {
        Tea x = new Tea();
        x.multiply((byte)(2), (byte)(3));     
        x.add(4,5);
       
    }

    
}
