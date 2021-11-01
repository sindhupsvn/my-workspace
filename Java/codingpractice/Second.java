package codingpractice;

public class Second {

    public static void main(String[] args) {
        
        String[] s = {"python", "java", "c", "ruby", "servlet"};

        for(int i=0; i<4; i++){

            for(int j= i+1; j<5; j++){

                if(s[i].compareTo(s[j])>0){

                    String temp = s[i];
                    s[i] = s[j];
                    s[j] =temp;


                }
            }
        }

        System.out.println("in lexicographical order");
        for(int i=0; i<5; i++){
            System.out.println(s[i]);
        }
    }
    
}
