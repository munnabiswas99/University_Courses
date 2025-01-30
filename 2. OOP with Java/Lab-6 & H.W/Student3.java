
package labtask6;

public class Student3 {
    private String name;
    private int id;
    private double cgpa;
    public Student3(){
        this.name = "Munna Biswas";
        this.id = 5261;
        this.cgpa = 3.56;
    }
    
    public Student3(String n, int i, double cg){
        this.name = n;
        this.id = i;
        this.cgpa = cg;
    }
    
    public void display(){
        System.out.println("\nName: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA: "+cgpa);
    }
    
    public static void main(String[] args) {
        Student3 st1 = new Student3();
        Student3 st2 = new Student3("Biswas",5299,3.75);
        Student3 st3 = new Student3("Rahim", 4589,3.66);
        
        st1.display();
        st2.display();
        st3.display();
    }
}
