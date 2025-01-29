
package labtask3;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("How many Numbers you want to insert?");
        size = input.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter "+size+" array elements");
        
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
