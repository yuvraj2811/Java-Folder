import java.util.Scanner;

public class Shape {

    void area (int radius){
        double areaOfShape = radius*radius*3.14;
    }

    void area(int length , int width){
        double areaOfShape = length*width;
    }

}

class Triangle extends  Shape{
    void area(int base,int height){
        double areaOfShape = 0.5*base*height;
        System.out.println(areaOfShape);

    }



}

class Area{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Triangle triangle=new Triangle();

        System.out.println("Enter the base of the triangle ");
        int base= sc.nextInt();

        System.out.println("Enter the height of the triangle ");
        int height =sc.nextInt();


        triangle.area(base,height);
    }
}