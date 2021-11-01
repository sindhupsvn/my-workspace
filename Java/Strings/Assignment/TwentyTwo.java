package Strings.Assignment;

public class TwentyTwo {
    public static void main(String[] args) {
        
        String str = "dont think too much";
        int count =0;
        for(int i=0; i<str.length(); i++){

            if((str.charAt(i) != ' '))
            count++;
        }
        System.out.println(+count);
    }
    
}
