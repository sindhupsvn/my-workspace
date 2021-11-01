package Arrays.allpractice;

public class first {

    public static void main(String[] args) {

        int[] x = new int[] {1,2,3,4,5};

        int[] y = new int[x.length];

        for(int i=0;i<x.length;i++){

            y[i] = x[i];
        }  
        
       System.out.println("elements of original array");
        for(int i=0;i<x.length;i++){

            System.out.println(x[i]);
        }

        System.out.println();

        System.out.println("elements of second array");
        for(int i=0;i<y.length;i++){

            System.out.print(y[i]);
        }
    }
    
}
