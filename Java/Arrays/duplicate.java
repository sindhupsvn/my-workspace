package Arrays;

public class duplicate {

    public static void main(String[] args) {
        
        String[] x = {"java", " servlets", "car", "dog", "java",  "car"};

        for(int i=0; i<x.length; i++){
            for(int j=i+1; j<x.length; j++)
            {
                if((x[i].equals(x[j])) && (i!=j))
                {
                    System.out.println("duplicate element"+ " " +x[j]);
                }
            }
        }

    }
    
}

