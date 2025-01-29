
package labtask2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter an integer number:");
        
        num = input.nextInt();
        
        if(num==0 || num==1)
        {
            System.out.println(num+" is not a prime number");
        }
        
        else
        {
            for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                System.out.printf("%d is not a prime number",num);
                count=1;
                break;
            }    
        }
            if(count==0)
                System.out.printf("%d is a prime number",num);
        }
         
    }
}
