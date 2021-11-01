package Arrays;

/*import java.util.Arrays;

//all zeroes to last

public class separatezeros {

  static  void movezerostoend(int x[]){
        System.out.println("input array"+ Arrays.toString(x));

        int counter =0; 

        for(int i=0; i<x.length;i++){   //traverse an array and first move all non zero elements at front

            if(x[i]!=0){

                x[counter] = x[i];
                counter++;

            }
        }

        while(counter<x.length){  //now remaining elements are zero

            x[counter] = 0;
            counter++;
        }

        System.out.println(Arrays.toString(x));
    }
    public static void main(String[] args) {
        
        movezerostoend(new int[]{12,0,7,0,4,0,3,0,0,2,3,5,0,6,7});

    }
}*/

//all zeroes to front

import java.util.Arrays;

public class separatezeros {

  static  void movezerostoend(int x[]){
        System.out.println("input array"+ Arrays.toString(x));

        int counter =x.length-1; 

        for(int i=x.length-1; i>=0;i--){   
            if(x[i]!=0){

                x[counter] = x[i];
                counter--;

            }
        }

        while(counter>=0){  

            x[counter] = 0;
            counter--;
        }

        System.out.println(Arrays.toString(x));
    }
    public static void main(String[] args) {
        
        movezerostoend(new int[]{12,0,7,0,4,0,3,0,0,2,3,5,0,6,7});

    }
}



