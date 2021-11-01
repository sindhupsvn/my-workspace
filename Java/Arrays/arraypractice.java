package Arrays;
public class arraypractice {

    public static void main(String[] args) {
        
       int[] x = {1,2,3,4,5};
        System.out.println(x[4]);
        System.out.println(x[2]);

        x[2] = 88;
        System.out.println(x[2]);

//printing all elements in an array

        for(int i=0; i<x.length;i++){   
            System.out.println(x[i]);
        }

        //adding all elements in an array

        int total=0;
        for(int i=0; i<x.length;i++){
            total = total + x[i];
        }
        System.out.println("total is" + total);


        //finding the largest element

        int max = x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>max);
            max = x[i];

        }
System.out.println("max is " +max);
    

   // int[] y = new int[10];

   //using for each loop

   for(int i : x){
       System.out.println(i);
   }

  


    

    
}
}
