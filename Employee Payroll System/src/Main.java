import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 abstract class Employee{
    private String name;
    private  int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

   public abstract double calculateSalary();


   @Override
    public String toString(){
        return "Employee "+name+" , id ="+id+" , salary = "+calculateSalary() ;
    }
}

class FulltimeEmployee extends  Employee{

    private double monthlySalary;

    public FulltimeEmployee(String name,int id, double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }

 @Override
 public double calculateSalary(){
     return monthlySalary;
 }
}

class PartTimeEmployee extends Employee{

    private  int hoursWorked;
    private  double hourlyRate;

    public PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}

class PayRollSystem{
    private ArrayList<Employee> employeeList;

    public PayRollSystem(){
        employeeList= new ArrayList<>();
    }

    public void  addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for (Employee employee:employeeList) {
        if (employee.getId()==id){
            employeeToRemove=employee;
            break;
        }
        }
        if (employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for (Employee employee :employeeList){
            System.out.println(employee);
        }
    }

}





public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("vikash",1,70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("saurav",2,40,100);

        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details: ");
        payRollSystem.displayEmployees();

        System.out.println("---------------------*-------------");

        System.out.println("Removing Employees");
        payRollSystem.removeEmployee(2);


        System.out.println("---------------*--------------");


        System.out.println("Remaining Employee 'Details");
        payRollSystem.displayEmployees();


    }
}