

public class Person {

    private String name;
  private  int age;

  public Person(){}

 public Person(String name,int age){
      this.name=name;
      this.age=age;
  }
  public String getName(){
     return name ;
  }
  public int getAge(){
     return age;
  }

}
class Employee1 extends Person{
    private double salary;
    private String department;

   public Employee1(String name , int age ,double salary,String department){
        super(name,age);
        this.salary=salary;
        this.department=department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

        public void emloyeeDetails(){
            System.out.println("Name of employee - "+getName());
            System.out.println("Age - "+getAge());
            System.out.println("Salary - "+getSalary());
            System.out.println("Department - "+getDepartment());

        }
}

class Manager1 extends Employee1{
    private double bonous;

    Manager1(String name ,int age ,double salary,String department,double bonous){
        super(name,age,salary,department);
        this.bonous=bonous;
    }

    @Override
    public double getSalary() {
        double salaryAndBonous= super.getSalary()+bonous;
        return salaryAndBonous;
    }
    public void managerDetails1(){
        System.out.println("Name of employee - "+getName());
        System.out.println("Age - "+getAge());
        System.out.println("Salary - "+getSalary());
        System.out.println("Department - "+getDepartment());

    }

}
class Main3{
    public static void main(String[] args) {

        Employee1 employee1 = new Employee1("Gaurav",25,50000,"FullStack Developer");
        employee1.emloyeeDetails();
        System.out.println("*------------------------------------------------------------------------------");
        Manager1 manager3 =new Manager1("Abhishek",25,50000,"Sales Department",3000);
        manager3.managerDetails1();

    }
}