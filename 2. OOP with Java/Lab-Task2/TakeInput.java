
package labtask2;

import java.util.Scanner;


public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,id,dept,sec;
        int age;
        double cgpa;
        
        System.out.println("Enter Your name: ");
        name = input.nextLine();
        
        System.out.println("Enter your age:");
        age = input.nextInt();
        
        System.out.println("Enter your CGPA:");
        cgpa = input.nextDouble();
        input.nextLine();
        
        System.out.println("Enter your Student ID: ");
        id = input.nextLine();
        
        System.out.println("Enter your section:");
        sec = input.next();
        input.nextLine();
        
        System.out.println("Enter your Department name:");
        dept = input.nextLine();
        
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.printf("CGPA: %.2f\n",cgpa);
        System.out.println("SID: "+id);
        System.out.println("Section: "+sec);
        System.out.println("Department: "+dept);
    }
}
