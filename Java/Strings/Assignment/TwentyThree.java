package Strings.Assignment;

public class TwentyThree {
    public static void main(String[] args) {
        
        String str = "do'n,t t;hin.k too much";
        int count =0;
        for(int i=0; i<str.length(); i++){

        if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') 
            count++;
        }
        System.out.println(+count);
    }
    


    }
    

