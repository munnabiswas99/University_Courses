
package labtask6;

import java.util.Scanner;

public class MyClass extends Mobile{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Enter the number of Mobile: ");
        N = input.nextInt();
        
        Mobile[] arr = new Mobile[N];
        
        for (int i = 0; i < N; i++) {
           System.out.println("\nEnter information for mobile "+(i+1)+": ");
            System.out.println("Enter Model Name: ");
            input.nextLine();
            String mn = input.nextLine();
            System.out.println("Enter Brand Name: ");
            String br = input.nextLine();
            System.out.println("Enter Product Code: ");
            int cd = input.nextInt();
            System.out.println("Enter Price: ");
            double pr = input.nextDouble();
           arr[i] = new Mobile(mn, br, cd, pr);
           
            
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println("\nDetails of Mobile "+(i+1)+":-");
            arr[i].displayRecord();
        }
        
        System.out.println("\nEnter the model name of the mobile which you want to delete: ");
        input.nextLine();
        String dlt = input.nextLine();
        
        for (int i = 0; i <N; i++) {
            if(dlt.equalsIgnoreCase(arr[i].modelName)){
                for (int j = i; j < N-1; j++) {
                    arr[j] = arr[j+1];
                }
            }
            
        }
        
        System.out.println("After deleting an item: ");
        for (int i = 0; i < N-1; i++) {
            System.out.println();
            arr[i].displayRecord();
        }
        
    }

    public MyClass(String n, String b, int c, double p) {
        super(n, b, c, p);
    }}
