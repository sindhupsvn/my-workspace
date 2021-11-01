package Exception;

public class fourteenth {

    public static void main(String[] args) {
        
        int[] x = {1,2,3,4};
        try{

        System.out.println(x[4]);
    }
    catch(ArrayIndexOutOfBoundsException ae){
        ae.printStackTrace();


    }
    
}
}
