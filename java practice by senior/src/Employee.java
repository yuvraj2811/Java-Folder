
public class Employee {
    String name;
    int id;
    String designation;

    void input(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;

    }

    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(designation);
         if (designation=="developer"){
             System.out.println("70000");
         } else if (designation=="frontEnd") {
             System.out.println("50000");
         } else if (designation=="backEnd") {
             System.out.println("50000");
         }
    }

    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.input("gaurav",45,"developer" );
        employee.display();

    }

}
