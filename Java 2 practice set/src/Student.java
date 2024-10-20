import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String toString(){
        return "Name -"+name+" Roll Number -"+rollNumber+" Grade -"+grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student");
        String name = sc.nextLine();

        System.out.println("Enter the roll number of student");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the grade of the student");
        String grade = sc.nextLine();

        Student student = new Student(name,roll,grade);
        System.out.println(student);


        System.out.println("Enter the name of student");
        String name1 = sc.nextLine();

        System.out.println("Enter the roll number of student");
        int roll1 = sc.nextInt();
        sc.nextLine();//consume new line given by int input

        System.out.println("Enter the grade of the student");
        String grade1 = sc.nextLine();

        Student student1 = new Student(name1,roll1,grade1);
        System.out.println(student1);


    }
}
