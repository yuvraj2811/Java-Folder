
public class Calculator {

    int add(int a,int b){
        System.out.print("The sum of two numbers (Integers) - ");
        return  a+b;
    }

    double add(double a,double b){
        System.out.print("The sum of two numbers (Double) -  ");
        return a+b;
    }

    int add(int a,int b,int c){
        System.out.print("The sum of three numbers (Integers) - ");
        return a+b+c;
    }
}

class OverLoading{
    public static void main(String[] args) {
        Calculator calculator= new Calculator();

        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(55.5,66.35));
        System.out.println(calculator.add(5,6,5));

    }
}
