import java.util.Scanner;

public class Q6FibonacchiNumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n = sc.nextInt();
        System.out.println("Enter your second number");
        int n1 =sc.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        if (n==a){
            System.out.print(a+" ");
        }
        while (temp<=n1){
            temp=a+b;
            a=b;
            b=temp;
            if (a>=n){
                System.out.print(a+" ");
            }

        }

    }
}
