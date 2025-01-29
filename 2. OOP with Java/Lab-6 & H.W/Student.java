
package labtask6;

import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    
    public void insert(String n, int i, double cg){
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
        int N, count=0;
        System.out.println("Enter the number of Student: ");
        N = input.nextInt();
        
        Student[] arr = new Student[N];
        
        for (int i = 0; i <N; i++) {
            System.out.println("\nEnter informatioin for student "+(i+1)+": ");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("CGPA: ");
            double cgpa = input.nextDouble();
            arr[i] = new Student();
            arr[i].insert(name, id, cgpa);
        }
        
        System.out.println("\nDetails:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nStudent "+(i+1)+": ");
            arr[i].display();
        }
        
        System.out.println("\nSearch for a Student:\nEnter Name: ");
        input.nextLine();
        String srch = input.nextLine();
        
        for (int i = 0; i < arr.length; i++) {
            if(srch.equalsIgnoreCase(arr[i].name)){
                count++;
                System.out.println("\nAvailable");
                arr[i].display();
                break;
            }
                
        }
        
        if(count<=0)
            System.out.println("\nNot Found");
        
        
    }
}
