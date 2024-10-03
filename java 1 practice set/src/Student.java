import java.util.Scanner;

public class Student {

    String name;
    int rollNumber;
    String grade;
    double marks;

    void study(float hour){
        System.out.println("Student study "+hour+" hours");
    }
    void takeExam(double score){
        System.out.println("marks obtained "+score);
    }

    void printDetail(){
        System.out.println("name "+name);
        System.out.println("roll number "+rollNumber);
        System.out.println("grade "+grade);
        System.out.println("marks "+marks);

    }
    public static void main(String[] args) {
   Student std1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        std1.name=sc.nextLine();
        System.out.println("Enter your roll number ");
        std1.rollNumber=sc.nextInt();
        System.out.println("Enter your grade ");
        std1.grade=sc.next();
        System.out.println("Enter your marks");
        std1.marks=sc.nextDouble();

        System.out.println("Enter how many hours your study ");
        float hour = sc.nextFloat();

        System.out.println("Enter score obtained by student");
        double score=sc.nextDouble();
        std1.study(hour);
        std1.takeExam(score);
        std1.printDetail();




    }
}
