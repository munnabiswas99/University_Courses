
package labtask4;

import java.util.Scanner;

public class Student {
    
    
    private String name;
    private int id;
    private double cgpa;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student();
        
        System.out.println("Enter Information for Student-1:");
        System.out.print("Enter Name: ");
        st1.name = input.nextLine();
        System.out.print("Enter SID: ");
        st1.id = input.nextInt();
        System.out.print("Enter CGPA: ");
        st1.cgpa = input.nextDouble();
        
        System.out.println("\nEnter Information for Student-2:");
        System.out.print("Enter Name: ");
        input.next();
        st2.name = input.nextLine();
        System.out.print("Enter SID: ");
        st2.id = input.nextInt();
        System.out.print("Enter CGPA: ");
        st2.cgpa = input.nextDouble();
        
        System.out.println("\nStudent-1:");
        System.out.println("Name: "+st1.name);
        System.out.println("SID: "+st1.id);
        System.out.println("CGPA: "+st1.cgpa);
        
        System.out.println("\nStudent-2:");
        System.out.println("Name: "+st2.name);
        System.out.println("SID: "+st2.id);
        System.out.println("CGPA: "+st2.cgpa);
        
        
        
        
    }

}
