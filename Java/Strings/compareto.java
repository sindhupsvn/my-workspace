public class compareto {
    public static void main(String[] args) {
        
       String Str1 = "sindhu";
        String Str2 = "sindhuram";

        System.out.println(Str1.compareTo(Str2));


        String s1="hello";  
String s2="hello";  
String s3="meklo";  
String s4="hemlo";  
String s5="flag";  
System.out.println(s1.compareTo(s2));//0 because both are equal  
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
System.out.println(s1.compareTo(s5)); //2 because "h" is 2 times greater than "f"  
    }
    
}


/*

if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  */