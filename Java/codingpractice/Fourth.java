package codingpractice;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Fourth {
    public static void main(String[] args) {
        
    
    try {
        int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
     } catch (ArrayIndexOutOfBoundsException e) {
        StringWriter writer = new StringWriter();
        e.printStackTrace(new PrintWriter(writer));

        String myString = writer.toString();
        System.out.println("Stack trace message ::"+myString);
     }
  }
}
    

