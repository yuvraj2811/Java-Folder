

public class MathOperations {


    void multiply(int a ,int b){
        int c = a*b;
        System.out.println("The multiply of two integers "+c);
    }

    void  multiply(double a, double b){
        double c= a*b;
        System.out.println("The multiplication of two numbers is "+c);
    }


    void  multiply(int a, int b,int c){
        double d= a*b*c;
        System.out.println("The multiplication of three numbers is "+d);
    }


    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        math.multiply(5,6);
        math.multiply(3.15,6.25);
        math.multiply(5,4,8);



    }
}
