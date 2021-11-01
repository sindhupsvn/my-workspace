package Strings.Assignment;

public class Twenty {
    public static void main(String[] args) {
        String x = "trust your the self trust through the self process";
        System.out.println(x.indexOf("self"));
        System.out.println(x.indexOf('t'));
        System.out.println(x.indexOf("the", 20)); //after 20 it will check for the and write the index of first leter the
        System.out.println(x.indexOf('l', 30)); //l is not found after 30. so, -1 is output
        System.out.println(x.lastIndexOf("self")); //last index of self will print
        System.out.println(x.lastIndexOf('t')); // last index of 't'
        System.out.println(x.lastIndexOf("the", 20));  //index of the before 20 will print
        System.out.println(x.lastIndexOf('l', 30)); // index of 'l' before 30 will print
       

    }
    
}
