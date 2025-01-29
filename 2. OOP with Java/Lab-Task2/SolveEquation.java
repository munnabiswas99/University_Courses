
package labtask2;

import java.util.Scanner;

public class SolveEquation {
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
        int A,B,C,D,eq1,eq2,eq3,eq4;
        System.out.println("Enter Four integer number:");
        
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        
        eq1 = A*B-C*D; //a) A*B-C*D
        eq2 = 2*A-B+3*D; //b) 2A-B+3D
        eq3 = A*A+B*B-C*C+D*D; // A^2+B^2-C^2+D^2
        eq4 = A*A*A+B-C*C; // A^3 + B –C^2
        
        System.out.println("Solution of Equation-1 = "+eq1);
        System.out.println("Solution of Equation-2 = "+eq2);
        System.out.println("Solution of Equation-3 = "+eq3);
        System.out.println("Solution of Equation-4 = "+eq4);
    }
        
}
