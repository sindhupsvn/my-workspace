public class lexicographical{
    public static void main(String[] args) {
        
        String[] words = { "r", "c", "p", "d", "g"};
        int n = 5;

        System.out.println("before sorting");
        

        for(int i=0; i<n-1;i++){

            for(int j=i+1;j<n;j++){

                if(words[i].compareTo(words[j])>0){

                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
            }
        }


    }

    for(int i=0; i<n; i++){
        System.out.println(words[i]);
    }
}
}
