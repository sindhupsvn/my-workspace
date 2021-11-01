package Arrays;

public class intersection {
    
    public static void main(String[] args) {
        
        int[] x = {23,12,45,60,80,78,90};
        int[] y = {24,23,12,60,80,79,100};
        System.out.println("intersection of two arrays");

        for(int i=0;i<x.length;i++){

            for(int j=0; j<x.length; j++){

                if(x[i]==y[j]){

                    System.out.println(y[j]);
                }
            }
        }
    }
}
