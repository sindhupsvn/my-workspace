package Exception;

public class Fifteenth {

    public static void main(String[] args) {

        try{
        int[] x = new int[-5];
        }
        catch(ArrayIndexOutOfBoundsException x){

        System.out.println(x);
    }
    catch(NegativeArraySizeException x ){

        x.printStackTrace();
    }

    finally{

        System.out.println("anything is executed");
    }
    
}
}
