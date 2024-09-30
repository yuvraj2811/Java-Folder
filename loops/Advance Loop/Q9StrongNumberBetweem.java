import java.util.Scanner;

public class Q9StrongNumberBetweem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your first number");
        int n=sc.nextInt();
        System.out.println("Enter your second number");
        int n1 =sc.nextInt();
        int fact=1;
        int num=n;
        int sum=0;
        System.out.print("Strong number = ");
        while (true){
            while (num>0){
                int rem =num%10;
                for (int i = 1; i <=rem ; i++) {
                    fact=fact*i;
                }
                sum=sum+fact;
                fact=1;
                num=num/10;
            }
            if (sum==n){
                System.out.print(n+" ");
            }
            n++;
            num=n;
            sum=0;
            if (n==n1){break;}
        }



    }
}
