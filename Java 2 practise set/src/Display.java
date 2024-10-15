import java.util.Scanner;

public class Display {

    void show(String name){
        System.out.println("My name is "+name);
    }

    void  show(String name ,String fatherName){
        System.out.println("My name is "+name);
        System.out.println("My Father's name is "+fatherName);
    }

    void  show(int age){
        System.out.println("My age is "+age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Display dis = new Display();

        System.out.println("Enter your name ");
        String name = sc.nextLine();

        dis.show(name);

        System.out.println("Enter your name and your father's name ");
        String name1 = sc.nextLine();
        String fatherName = sc.nextLine();

        dis.show(name1,fatherName);

        System.out.println("Enter your age ");
        int age = sc.nextInt();
        dis.show(age);



    }

}
