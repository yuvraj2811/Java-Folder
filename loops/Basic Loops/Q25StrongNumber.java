import java.util.Scanner;

public class Q25StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int sum=0;
        int n1=n;
        int pro=1;
        while (n>0){
          int rem = n%10;
            for (int i = 1; i <=rem ; i++) {
                pro=pro*i;
            }
            sum=sum+pro;
            pro=1;
            n=n/10;
        }
        if(sum==n1){
            System.out.println(n1+" is a strong number");
        }else {
            System.out.println(n1+" is not a strong number");
        }
    }
}
