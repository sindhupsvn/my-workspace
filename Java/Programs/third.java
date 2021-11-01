package Programs;

import java.util.Scanner;

//remove all white spaces without using built in method( replace())

public class third{
 

    /*public static void main(String[] args) {

        String x = ("Saket Saurav        is an Autom ation Engi ne      er");

        char[] y = x.toCharArray();

        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<y.length;i++){

            if((y[i]!= ' ') && (y[i]!= '\t'))
            {
                sb.append(y[i]);
            }

        }

        System.out.println(sb);

    }
}*/

public static void main(String[] args) {

    // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    // take the input
    String input = sc.nextLine();
    System.out.println("Original String: " + input);

    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}

