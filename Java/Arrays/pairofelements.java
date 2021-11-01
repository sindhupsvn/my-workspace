package Arrays;

import java.util.Arrays;

public class pairofelements {
   
  static  void findthepair(int x[], int num)
    {
        System.out.println(Arrays.toString(x));

        System.out.println(num);

        System.out.println("Pairs of elements whose sum is "+num+" are : ");

        for(int i=0;i<x.length;i++){
            for(int j=i+1; j<x.length; j++){

                if(x[i]+x[j] == num){
                    System.out.println(x[i]+ "+" + x[j]+ " = " + num);
                }
            }
        }
        System.out.println("===========");
  
    }
    public static void main(String[] args) {
        
        findthepair(new int[]{4,6,5,-10},10);
        findthepair(new int[]{40,60,50,-10},100);

    }
}
