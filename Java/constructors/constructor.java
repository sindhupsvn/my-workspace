package constructors;

public class constructor {

   static int i;

    String name;

    constructor (int id, int y, int z){
        this(2, "sindhu");
        System.out.println("3 parameters constructor");
    }
                                                    //constructor overloading
    constructor(int i, String name){
        System.out.println("parameterized constructor");
    }

    constructor(){
        this(4, 5, 6);        //constructor chaining
        System.out.println("default constructor");
    }





    public static void main(String[] args) {

        constructor x = new constructor(4,5,6);
        constructor x1 = new constructor(5, "haya");
        System.out.println(x.name);
        System.out.println(constructor.i);

        
    }

    
    
}

