import java.util.Scanner;

public class Employee {

    String name;
    double salary;

    void getDetails(){
        System.out.println("Name -"+name+" Salary"+salary);
    }
}

class Manager extends Employee{
    String department;

    void getDetails(){
        System.out.println("Name -"+name+" Salary -"+salary+" Department -"+department);
    }
}

class Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("Enter Employee name");
        manager.name=sc.nextLine();

        System.out.println("Enter the salary ");
        manager.salary=sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the department name");
        manager.department =sc.nextLine();

        manager.getDetails();
    }
}