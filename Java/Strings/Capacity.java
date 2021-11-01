package Strings;

public class Capacity{
    public static void main(String[] args) {
        
    
StringBuffer  sb = new StringBuffer();
System.out.println(sb.capacity());
sb.append("hello");
System.out.println(sb.capacity());
sb.append("you are amazing just the way you are");
System.out.println(sb.capacity());
sb.ensureCapacity(10);
sb.ensureCapacity(50);
System.out.println(sb.capacity());







    
}
}
