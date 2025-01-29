
package labtask4;

import java.util.Scanner;

public class CompareStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1,s2,s3;
        System.out.println("Enter String-1:");
        s1 = input.nextLine();
        System.out.println("Enter String-2:");
        s2 = input.nextLine();
        System.out.println("Enter String-3:");
        s3 = input.nextLine();
        if(s1.length() > s2.length() && s1.length()> s3.length())
            System.out.println("String-1 is Large");
        else if(s2.length() > s1.length() && s2.length() > s3.length())
            System.out.println("String-2 is Large");
        
         else if(s3.length() > s1.length() && s3.length() > s2.length())
            System.out.println("String-3 is Large");
        else
            System.out.println("Strings are equal");
        
    }
}
