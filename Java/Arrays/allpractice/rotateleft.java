package Arrays.allpractice;

public class rotateleft {
    

    public static void main(String[] args) {
        
        int x[] = new int[]{1,2,3,4,5};

        System.out.println("printing original array");

        for(int i=0;i<x.length;i++){

            System.out.println(x[i]);
        }

        int n=3;

        int j, first;

        for(int i=0; i<n; i++){

            first = x[0];

            for(j=0; j<x.length-1;j++){

                x[j] = x[j+1];


            }

            x[j] =first;
        }

        System.out.println();
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< x.length; i++){  
            System.out.print(x[i] + " "); 
    }
}
}
