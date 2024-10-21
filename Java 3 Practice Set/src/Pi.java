

public class Pi {
    final double pi=3.14;

    void area(double radius){
        System.out.println("The area of a circle in cm  is - "+pi*radius*radius);
    }

    public static void main(String[] args) {
        Pi pi =new Pi();

        System.out.println("If your try to modify the final variable it give you this message");
        System.out.println("java: cannot assign a value to final variable pi");

        pi.area(5);
    }
}

