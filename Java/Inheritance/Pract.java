package Inheritance;

public class Pract {

    int i=10;

    void m1(){
        System.out.println("method");
    }

    private Pract(){                        
        System.out.println("constructor");
    }


    
}


class dog extends Pract{

    public static void main(String[] args) {
        
        dog x = new dog();
        
    }

}
