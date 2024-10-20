import java.util.Scanner;

public class Geometry {

    void area(double radius){
        double areaOfCircle = 3.14*radius*radius;
        System.out.println("The area of a circle in cm -"+areaOfCircle);
    }

    void area(double length, double width){
        double areaOfRectangular = length*width;
        System.out.println("The area of rectangular in cm -"+areaOfRectangular);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Geometry geo = new Geometry();

        System.out.println("Enter the radius of a circle in cm");
        double radius = sc.nextDouble();

        geo.area(radius);

        System.out.println("Enter the length of a rectangular in cm");
        double length = sc.nextDouble();

        System.out.println("Enter the width of a rectangular in cm");
        double width = sc.nextDouble();

        geo.area(length,width);

    }
}
