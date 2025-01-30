
package homework;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,sum,sub,mul;
        double div;
        System.out.println("Enter Two Integer Number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        sum = num1+num2;
        sub = num1-num2;
        mul = num1*num2;
        div = (double)num1/num2;
        System.out.println("Sum = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
    }
}
