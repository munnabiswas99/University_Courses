
package labtask2;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter Two Integer Number: ");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        sum = num1+num2;
        System.out.println("Sum = "+sum);
        
    }
}
