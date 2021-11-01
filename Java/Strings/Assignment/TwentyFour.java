package Strings.Assignment;

public class TwentyFour {
    

    public static void main(String[] args) {

       int countv=0; int countc =0;
        String str =  "treat yourself";

       str = str.toLowerCase();
       for(int i=0; i<str.length();i++){

       if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) =='o'|| str.charAt(i) =='u' ){
           countv++;
       }
       else if ( str.charAt(i)>='a' && str.charAt(i)<='z'){
           countc++;
       }
    }
       

       System.out.println("Number of vowels: " + countv);    
        System.out.println("Number of consonants: " + countc);  

       }
    }

    

