import java.util.Scanner;

interface Drawable{
    void draw();
 }

interface  Resizable{
    void resize(int length,int width);
}




public class Rectangle implements Drawable,Resizable {

    int length ;
    int width;

    void input(int length, int width){
        this.length=length;
        this.width=width;
    }

    public void draw() {
        System.out.println("length of rectangle is -" + length);
        System.out.println("Width of the rectangle is - " + width);
        System.out.println("Area of the rectangle -" + (length * width));
    }
      public void resize(int length, int width){
            System.out.println("New area of the rectangular is -"+(length*width));
        }
    }


class NewArea{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle=new Rectangle();

        System.out.println("Enter the length of rectangle");
        int length=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter the width of the rectangle");
        int width =sc.nextInt();
        sc.nextLine();

        rectangle.input(length,width);
        rectangle.draw();

        System.out.println("Enter the new length of rectangle");
        int length1=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter the new width of the rectangle");
        int width2 =sc.nextInt();
        sc.nextLine();

        rectangle.resize(length1,width2);
    }
}