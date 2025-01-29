
package labtask2;

import java.util.Scanner;


public class CheekInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char A;
        System.out.println("Enter any Character on keyboard :");
        
        A = input.next().charAt(0);
        
        
        if(A>='0' && A<='9')
            System.out.printf("%c is a digit",A);
        
        else if((A>='a' && A<='z') || (A>='A' && A<='Z')){
            System.out.printf("%c is a Alphabet: ",A);
            
            if(A=='a' || A=='e' || A=='i' || A=='o' || A=='u' || A=='A' || A=='E' || A=='I' || A=='O' || A=='U')
                System.out.println("It is an Vowel");
            else
                System.out.println("It is a Consonant");
                }
            
        else
            System.out.printf("%c is a Spacial Character",A);
        
            
            
    }
}
