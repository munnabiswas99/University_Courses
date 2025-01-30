
package labtask4;

import java.util.Scanner;

public class EqualStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1,s2,s3;
        System.out.println("Enter String-1:");
        s1 = input.nextLine();
        System.out.println("Enter String-2:");
        s2 = input.nextLine();
        System.out.println("Enter String-3:");
        s3 = input.nextLine();
        
        boolean b1 = s1.equals(s2);
        if(b1==true){
            System.out.println("String – 1 is Equals to String- 2");
        }
        
        boolean b2 = s1.equals(s3);
        if(b2==true){
            System.out.println("String – 1 is Equals to String- 3");
        }
        
        boolean b3 = s2.equals(s3);
        if(b3==true){
            System.out.println("String – 2 is Equals to String- 3");
        }
    }
}
