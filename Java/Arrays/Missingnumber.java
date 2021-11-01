package Arrays;

public class Missingnumber {

    static int hi(int n){ //method to calculate sum of n numbers 

        int sum = (n*(n+1))/2;

        return sum;
    }

    static int hello(int[] x) //method to calculate sum of all elements of an array
    {
        int sum =0;

        for(int i=0; i<x.length; i++){

            sum = sum + x[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        
        int n=8;
        int[] x = {1,2,3,4,5,6,8};

        int hi = hi(n);

        int hello = hello(x);

        int M = hi - hello;

        System.out.println(M);

    }
    
}
