
package labtask6;
public class Mobile {
    String modelName;
    private String brand;
    private int code;
    private double price;
    public Mobile(String n,String b, int c, double p){
        this.modelName = n;
        this.brand = b;
        this.code = c;
        this.price = p;
    }
    
    public void displayRecord(){
        System.out.println("Model Name: "+modelName);
        System.out.println("Brand Name: "+brand);
        System.out.println("Product Code: "+code);
        System.out.println("Price : "+price);
    }
    
    
}
