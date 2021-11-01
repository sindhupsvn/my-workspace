package Arrays;

public class secondlargest {

    public static void main(String[] args) {
        
        int temp;
        int x[] = {10,20,30,40,50,60};

        for(int i=0;i<x.length;i++){

            for(int j=i+1; j<x.length;j++){

                if(x[i]>x[j]){
                    
                    temp = x[i];

                    x[i] = x[j];

                    x[j] = temp;
                }
            }

        }
        System.out.println("second largest element" + x[x.length-2]);
    }
    
}
