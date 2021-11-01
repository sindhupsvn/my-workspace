package Exception;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
        try {
            int num, num1, sum;
        System.out.println("Enter the numbers to sum : ");
        Scanner scannerObj = new Scanner(System.in);
        num = scannerObj.nextInt();
        num1 = scannerObj.nextInt();
            sum = num + num1;
            System.out.println("Sum of numbers : " + sum);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Sum of Integer value using exception!");
           // scannerObj.close();
        }

    }
}