package homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double base,hight,area;
        
        System.out.println("Enter Base and Hight: ");
        
        base = input.nextDouble();
        hight = input.nextDouble();
        
        area = .5*base*hight;
        
        System.out.printf("Area = %.2f\n",area);
       
    }
    
}
