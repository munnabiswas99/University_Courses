
package labtask6;

import java.util.Scanner;

public class Student2 {
    private String name;
    private int id;
    private double cgpa;
    
    Student2(String n, int i, double cg){
        this.name = n;
        this.id = i;
        this.cgpa = cg;
        
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("CGPA: "+cgpa);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Enter the number of Student: ");
        N = input.nextInt();
        
        Student2[] arr = new Student2[N];
        
        for (int i = 0; i <N; i++) {
            System.out.println("\nEnter informatioin for student "+(i+1)+": ");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("CGPA: ");
            double cgpa = input.nextDouble();
            arr[i] = new Student2(name, id, cgpa);
        }
        
        System.out.println("\nDetails:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nStudent "+(i+1)+": ");
            arr[i].display();
        }
    }
}
