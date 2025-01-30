package labtask3;

public class MaxMin {
    public static void main(String[] args) {
        int n1=40,n2=-20,n3=30;
        int maxtm = Math.max(n1,n2);
        int maxfn = Math.max(maxtm, n3);
        
        int mintm = Math.min(n1,n2);
        int minfn = Math.min(mintm, n3);
        
        System.out.println("Maximum = "+maxfn);
        System.out.println("Minimum = "+minfn);
        
    }
}
