package Interface;

public interface Anonymus {

    int x=20;
    void getage();
}



class MyClass implements Anonymus{

    public void getage(){
        System.out.println("Age is :" +x);
    }

    
}
class AnonymusDemo{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.getage();

    }
}
