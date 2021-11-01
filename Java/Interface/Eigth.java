package Interface;

public interface Eigth {
    void a1();

    default void a2(){
        class innerc implements Eigth{

            public void a1(){
                System.out.println("abstract method");
            }

           

        public static void main(String[] args) {
            Eigth x = new innerc();
            x.a1();
            x.a2();
        }


    }
}
}

    

