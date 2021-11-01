package Strings.Assignment;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence");

        String x = input.nextLine();

        int vowels =0, consonants =0, symbols=0, digits=0, spaces=0;

      String y = x.toLowerCase();

      for(int i=0; i<y.length(); i++){

        char ch = x.charAt(i);

        if(ch == 'a'|| ch == 'e'|| ch=='i' || ch=='o' || ch=='u'){
            ++vowels;
        }
        else if((ch>='a' && ch<='z')){
            ++consonants;
        }
        else if(ch>='0' && ch <='9'){
            ++digits;
        }
        else if (ch== ' '){
            ++spaces;
        }
        else{
            ++symbols;
        }
    }
        System.out.println( vowels);
System.out.println( consonants);
System.out.println( digits);
System.out.println( spaces);
System.out.println(symbols);

      
        
    }
    
}
