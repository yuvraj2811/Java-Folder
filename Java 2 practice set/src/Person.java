import java.util.Scanner;

public class Person {

    String name;
    int age;

    void displayInfo(){
        System.out.println("Name -"+name+" age -"+age);
    }
}

class student2 extends Person{

    int rollNumber;

    @Override
    void displayInfo() {
        System.out.println("Name -"+name+" Age -"+age+" Roll Number -"+rollNumber);
    }
}

class Info{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student2 student = new student2();
        System.out.println("Enter your name");
        student.name=sc.nextLine();

        System.out.println("Enter your age");
        student.age=sc.nextInt();

        System.out.println("Enter your roll number");
        student.rollNumber=sc.nextInt();

        student.displayInfo();
    }
}