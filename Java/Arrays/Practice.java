package Arrays;


public class Practice {
    
 


   public static void main(String args[])
   {
       int i, j;
       int mat1[][] = new int[][]{{4,5,3},{8,4,3},{1,4,3}};
       int mat2[][] = new int[][] {{2,2,6},{1,3,4},{1,5,1}};
       int res[][] = new int[3][3];
       /*Scanner scanner = new Scanner(System.in);
 
       System.out.print("Enter Matrix 1 Elements : ");
       for(i=0; i<3; i++){
           for(j=0; j<3; j++){
               mat1[i][j] = scanner.nextInt();
           }
       }
 
       System.out.print("Enter Matrix 2 Elements : ");
       for(i=0; i<3; i++){
           for(j=0; j<3; j++){
               mat2[i][j] = scanner.nextInt();
           }
       }*/
 
       for(i=0; i<3; i++){
           for(j=0; j<3; j++){
               res[i][j] = mat1[i][j] - mat2[i][j];
           }
       }
 
    System.out.println("New Matrix is : ");
       for(i=0; i<3; i++){
           for(j=0; j<3; j++){
               System.out.print(res[i][j]+ " ");
           }
           System.out.println();
       }
   }
    
}
