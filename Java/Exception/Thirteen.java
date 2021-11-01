package Exception;

public class Thirteen {
    public static void main(String[] args) {
        
        int x = 10;

        int y =0;
        try{

        int z = x/y;
        System.out.println(z);

        }
        catch(ArithmeticException a){
            a.printStackTrace();

            
        }
    }
    
}
