
package labtask2;

import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer number:");
        
        num = input.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d = %d\n",num,i,num*i);
            
        }
    }
}
