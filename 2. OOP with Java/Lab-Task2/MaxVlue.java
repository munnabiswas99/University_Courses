
package labtask2;

import java.util.Scanner;


public class MaxVlue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int A, B, C;
       System.out.println("Enter three integer value:");
        
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
       
       if(A>B && A>C)
            System.out.println("Maximum value = "+A);
       
       else if(B>A && B>C)
            System.out.println("Maximum value = "+B);
       
       else if(C>A && C>B)
            System.out.println("Maximum value = "+C);
       
       else
            System.out.println("All values are equal");
    }
}
