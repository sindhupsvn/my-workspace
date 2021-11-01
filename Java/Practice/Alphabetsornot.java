package Practice;

import java.util.Scanner;

/*import java.util.Scanner;

public class Alphabetsornot {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter alphabet");
     char x = input.next().charAt(0);

     if(x>='a' && x<='z' || x>='A' && x<='Z'){

        System.out.println(x+ "is an alphabet");

     }
     else {
         System.out.println(x+" is not an alphabet");
     }

     input.close();


    
}
}*/

//FACTORIAL NUMBER

/*public class Alphabetsornot{
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("enter number");
    int x = input.nextInt();

    int i,fact =1;
    for(i=1;i<=x;i++){

        fact = fact*i;


    }
    System.out.println("factorial of a number" +fact);

    
}
}*/

//DISPLAY CHARACTERS FROM A TO Z

/*public class Alphabetsornot{

    public static void main(String[] args) {
        
        for(char i='a'; i<='z';i++){
            System.out.println(i+ " ");
        }
    }
}*/

//GCD OF TWO NUMBERS
public class Alphabetsornot{
    public static void main(String[] args) {
        
        int n1=81, n2 = 153;
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2; ++i){
            if(n1%i==0 && n2%i==0)
           gcd = i;
        }
        System.out.println("gcd of"+ n1 + "and" + n2 + "is" + gcd);
    }
}




