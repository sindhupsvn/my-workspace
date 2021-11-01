package Exception;

public class constructor {

    int x=90;
    int b=0;

    constructor(){
        this("sindhu");
        try{
            int z = x/b;

        }catch(ArithmeticException ae){

            System.out.println("arithmetic exception");

        }
        System.out.println("default constructor");
    }

    constructor(String name){
        System.out.println("parameterized constructor");
    }

    public static void main(String[] args) {
        constructor y = new constructor();
        System.out.println(y.x);
    }


    
}
