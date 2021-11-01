package Interface;

public interface nestedInter {

    void hi();

   public interface innerinter{    //by default nested interface is static in nature

        int j=5;

        void hello();
    }
}

    class Fast implements nestedInter{

       public void hi(){
            System.out.println("implementing abstract method");
        }

        public static void main(String[] args) {
            Fast x = new Fast();
            x.hi();
           System.out.println(innerinter.j);
            
        }

    }


    

