package Arrays.allpractice;

public class evenposition {

    public static void main(String[] args) {
        
        int[] x = new int[]{1,2,3,4,5,6,7};

        for(int i=0;i<x.length;i=i+2){

            System.out.println(x[i]);
        }
    }
    
}

//odd positions

for(int i=1;i<x.length;i++){

    System.out.println(x[i]);
}