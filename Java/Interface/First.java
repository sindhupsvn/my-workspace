package Interface;



public interface First {

    int a =19;
    void display();

}

class Test implements First{

    public void display(){
        System.out.println("implementing abstract method");
    } 
}


class Run{
public static void main(String[] args) {
   // First x = new Test(); 
   Test x = new Test(); // creating a reference object for interface
    x.display();
    System.out.println(First.a);
    x.display();
}
}


    