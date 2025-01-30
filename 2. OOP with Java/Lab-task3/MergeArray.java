
package labtask3;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1,N2;
        System.out.print("N1 = ");
        N1 = input.nextInt();
        System.out.println("Enter "+N1+" Aarray elements");
        int[] arr1 = new int[N1];
        
        for (int i = 0; i < N1; i++) {
            arr1[i] = input.nextInt();
        }
        
        System.out.print("N2 = ");
        N2 = input.nextInt();
        System.out.println("Enter "+N2+" Aarray elements");
        int[] arr2 = new int[N2];
        
        for (int i = 0; i < N2; i++) {
            arr2[i] = input.nextInt();
        }
        
        int[] merge = new int[N1+N2];
        int c = 0;
        
        for (int i = 0; i <N1 ; i++) {
            merge[i] = arr1[i];
            c++;
        }
        
        for (int i = 0; i < N2; i++) {
            merge[c++] = arr2[i];
        }
        
        for (int i = 0; i < N1+N2; i++) {
            System.out.print(merge[i]+" ");
        }
    }
}
