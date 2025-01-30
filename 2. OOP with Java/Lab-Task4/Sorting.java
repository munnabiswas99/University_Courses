
package labtask4;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        
        String names[] = {"Babul","Kamal","Alam","Antara"};
        
        Arrays.sort(names);
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
