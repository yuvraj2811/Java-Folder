import java.util.Scanner;

public class Q20Fibonachi {
    public static void main(String[] args) {
        System.out.println("Enter your number to print fibonachi");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a,b;
        a=0;b=1;
        int temp=a+b;
        System.out.print(a+" ");
        while (n>=temp){

            temp=a+b;
            a=b;
            b=temp;
            System.out.print(a+" ");
        }
    }
}
