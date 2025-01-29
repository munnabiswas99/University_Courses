
package labtask2;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Enter your obtained number:");
        num = input.nextInt();
        
        if(num>=80)
            System.out.println("Grade: A+\nGrade Point: 4.00\nRemarks: Outstanding\n");
        
        else if(num>=75)
            System.out.println("Grade: A\nGrade Point: 3.75\nRemarks: Excellent\n");
        
        else if(num>=70)
            System.out.println("Grade: A-\nGrade Point: 3.50\nRemarks: Very Good\n");
        
        else if(num>=65)
            System.out.println("Grade: B+\nGrade Point: 3.25\nRemarks: Good\n");
        
        else if(num>=60)
            System.out.println("Grade: B\nGrade Point: 3.00\nRemarks: Satisfactory\n");
        
        else if(num>=55)
            System.out.println("Grade: B-\nGrade Point: 2.75\nRemarks: Avobe Avarege\n");
                    
                    else if(num>=50)
            System.out.println("Grade: C+\nGrade Point: 2.50\nRemarks: Avarege\n");
        
         else if(num>=45)
            System.out.println("Grade: C\nGrade Point: 2.25\nRemarks: Below Avarege\n");
        
         else if(num>=40)
            System.out.println("Grade: D\nGrade Point: 2.00\nRemarks: Pass\n");
        
         else
            System.out.println("Grade: F\nGrade Point: 0.00\nRemarks: Fail\n");
    }
}
