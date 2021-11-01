package Programs;

public class First {

    //how to reverse a string without using builtin function

    //convert to character array and print in reverse order

    /*public static void main(String[] args) {
        

        String str = "sindhuram";

        char x[] =str.toCharArray();

        for(int i=x.length-1; i>=0; i--){

            System.out.println(x[i]);
        }

    }

    
}*/

//using built-in function

public static void main(String[] args) {
    
    String str = "sindhu";

    StringBuilder x = new StringBuilder();
    x.append(str);

   x = x.reverse();
   System.out.println(x);

}
}