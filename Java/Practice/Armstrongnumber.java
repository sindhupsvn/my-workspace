package Practice;

import java.util.Scanner;

public class Armstrongnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
       int  temp = input.nextInt();

        
        int r,cube=0, num;
        num= temp;
        while(temp>0){
            r=temp%10;
            temp = temp/10;
            cube = cube+(r*r*r);
        }

        if(num==cube){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
    
}
