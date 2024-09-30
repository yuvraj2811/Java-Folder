import java.util.Scanner;

public class Q8ArmStrongBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n =sc.nextInt();
        System.out.println("Enter your second number");
        int n1 = sc.nextInt();
        int num =n;
        int num1 =n;
        int count=0;
        int pro=1;
        int sum=0;
        System.out.println("Arm strong number");
        while (true){
            while (num>0){
                count++;
                num=num/10;
            }
            while (num1>0){
                int rem=num1%10;
                for (int i = 1; i<=count ; i++) {
                    pro=pro*rem;
                }
                sum=sum+pro;
                pro=1;
                num1=num1/10;
            }
            if (sum==n){
                System.out.print(n+" ");
            }
            n++;
            num=n;
            num1=n;
            sum=0;
            count=0;
            if (n==n1){break;}
        }



    }
}
