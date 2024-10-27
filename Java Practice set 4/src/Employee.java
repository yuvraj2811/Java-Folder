
import java.util.ArrayList;
public abstract class Employee {

   private String name;
   private int id;
   private double salary;

   public Employee(String name ,int id ,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
  public String getName(){
        return name;
  }
  public int getId(){
        return id;
  }
  public double getSalary(){
        return salary;
    }

    public abstract double calculateBonus();

   @Override
    public String toString(){
       return "Employee "+name+" id = "+id+" salary "+salary+" bonous -"+calculateBonus();
   }
}

class Manager extends Employee{

    int teamSize;

  public  Manager(String name,int id,double salary ,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    public double calculateBonus(){
       double bonous = 0.05*getSalary()*teamSize;
       return  bonous;
    }
        }

 class Developer extends Employee{

    String skillLevel;
   public Developer(String name,int id,double salary,String sillLevel){
        super(name,id,salary);
        this.skillLevel=sillLevel;
    }

     @Override
     public double calculateBonus() {
        double bonous;
         if (skillLevel=="junior"){
             bonous=getSalary()*0.05;
             System.out.println("The bonous of a junior developer is - "+bonous);
             return bonous;
         } else if (skillLevel=="mid") {
             bonous=getSalary()*0.1;
             System.out.println("The bonous of a mid developer is - "+bonous);
            return  bonous=getSalary()*0.1;
         }
         else {
             bonous=getSalary()*0.15;
             System.out.println("The bonous of a senior developer is - "+bonous);
           return  bonous=getSalary()*0.15;

         }
     }
 }

 class Department{
    private ArrayList<Employee> employeeList;

    public Department(){
        employeeList= new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id ){
        Employee employeeToRemove=null;
        for (Employee employee:employeeList){
           if( employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if (employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

     public static void main(String[] args) {
         Department department= new Department();
         Manager manager1=new Manager("Abhi",1,50000,5);
         Developer developer1=new Developer("Gaurav",5,70000,"mid");

         department.addEmployee(manager1);
         department.addEmployee(developer1);

         System.out.println("The employee details ---------");
         department.displayEmployee();
     }

 }