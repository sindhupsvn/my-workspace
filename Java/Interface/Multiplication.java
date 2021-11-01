package Interface;

interface Multiplication {

   int multiplication(int i , int j);   //no method body so, no need of writing return
    
}

class A implements Multiplication{

   public int multiplication(int i , int j){
      int k = i*j;

      return k;
   }



public static void main(String[] args) {

   A t = new A();
  System.out.println(t.multiplication(3, 4));
   
}
}