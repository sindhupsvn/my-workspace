package Interface;

public interface Parameter {
    void m1();
    
}
class Test2{

    static void cat(Parameter obj){

        obj.m1();

    }
    public static void main(String[] args) {
        Test2.cat(new Parameter(){
            public void m1(){
                System.out.println("method");
            }
    });
}
}
