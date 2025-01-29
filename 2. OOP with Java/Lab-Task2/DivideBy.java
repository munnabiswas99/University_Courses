
package labtask2;

public class DivideBy {
    public static void main(String[] args) {
        
        System.out.println("""
                           All the numbers between 1 and 100 which are
                           dividable by 3 and 6 except 30, 60 and 90 are:""");
        
        for (int i=1; i<=100; i++)
        {
            if(i!=30 && i!=60 && i!=90)
            {
                if(i%3==0 || i%6==0)
                {
                    System.out.print(" "+i);
                }
            }
        }
    }
}
