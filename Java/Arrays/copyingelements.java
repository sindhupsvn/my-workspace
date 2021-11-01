package Arrays;

public class copyingelements {

    public static void main(String[] args) {
        
        int[] x = new int[]{1,2,3,4,5};

        int[] y = new int[x.length];

        for(int i=0;i<x.length;i++){

            y[i] = x[i];
        }
        System.out.println("elements of original array" );

        for(int i=0;i<x.length;i++){

            System.out.println(x[i]);
        }
        System.out.println();

        System.out.println("elements of new array");

        for(int j =0; j<y.length; j++){

            System.out.print(y[j]+ " ");
        }
    }
    
}
