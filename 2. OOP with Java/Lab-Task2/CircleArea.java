
package labtask2;

import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,area;
        System.out.println("Enter the radius of the circle: ");
        
        r = input.nextDouble();
        
        area = Math.PI*r*r;
        
        System.out.printf("Area = %.2f",area);
    }
}
