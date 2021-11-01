package Arrays.allpractice;

public class duplicate {

    public static void main(String[] args) {
        
        int[] x = new int[]{1,2,3,4,2,3};

        

        for(int i=0;i<x.length;i++){

            for(int j=i+1; j<x.length;j++){

                if(x[i]==x[j])

                System.out.println(x[j]);
            }
        }
    }
}



            