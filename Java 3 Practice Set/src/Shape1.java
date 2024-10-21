import java.util.Scanner;

public abstract class Shape1 {
    abstract double calculateArea();
    abstract  double calculatePerimeter();
}

class Circle extends Shape1{
    double radius;

    void setRadius(double radius){
        this.radius=radius;
    }

    double calculateArea(){
        System.out.print("Area of the circle - ");
        return 3.14*radius*radius;
    }

    double calculatePerimeter(){
        System.out.print("Perimeter of the circle - ");
        return  2*3.14*radius;
    }

}

class Rectangle1 extends Shape1{

    double length;
    double width;

    void setLengthWidth(double length,double width){
        this.length=length;
        this.width=width;
    }

    double calculateArea(){
        System.out.print("Area of a rectangle - ");
        return length*width;
    }

    double calculatePerimeter(){
        System.out.print("Perimeter of a rectangle - ");
        return 2*(length+width);
    }

}

class Area1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle= new Circle();

        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();

        circle.setRadius(radius);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println("----------------------*--------------------");
        Rectangle1 rectangle = new Rectangle1();

        System.out.println("Enter the length of a rectangle ");
        double length = sc.nextDouble();

        System.out.println("Enter the width of a rectangle ");
        double width =sc.nextDouble();

        rectangle.setLengthWidth(length,width);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

    }
}