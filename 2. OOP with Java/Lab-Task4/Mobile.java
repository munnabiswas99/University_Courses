
package labtask4;

import java.util.Scanner;

public class Mobile {
    private String modelName;
    private String brand;
    private int code;
    private double price;
    Mobile(String n,String b, int c, double p){
        this.modelName = n;
        this.brand = b;
        this.code = c;
        this.price = p;
    }
    
    public void display(){
        System.out.println("Model Name: "+modelName);
        System.out.println("Brand Name: "+brand);
        System.out.println("Product Code: "+code);
        System.out.println("Price : "+price);
    }
    
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
            arr[i].display();
        }
        
    }
}
