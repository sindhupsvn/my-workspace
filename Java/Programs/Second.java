package Programs;

import java.util.Scanner;

//swapping with and without using third variable

public class Second {

    public static void main(String[] args) {
        
        int a,b,temp;
        Scanner x = new Scanner(System.in);

        System.out.println("enter a value");

         a = x.nextInt();

         System.out.println("enter b value");
         b = x.nextInt();

         System.out.println("before swapping"+ a + " "+ b);
         
        temp = a;
        a = b;
        b = temp;

       /*a = a+b;
       b = a -b;   //without using the third variable
       a = a-b;*/

        System.out.println("after swapping"+ a + " "+ b);


    }
    
}
