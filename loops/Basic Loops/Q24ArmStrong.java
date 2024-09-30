import java.util.Scanner;

public class Q24ArmStrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int num=n;
        int n1=n;
        int sum=0;
        int pro=1;
        int count =0;
        int rem;
        while (n>0){
            count++;
            n=n/10;
            }
        while (num>0){
            rem=num%10;
            for (int i = 1; i <=count ; i++) {
                pro=pro*rem;
            }
            sum= sum+pro;
            pro=1;
            num=num/10;
        }
        if (n1==sum){
            System.out.println("This number is a armstrong");
        }else {
            System.out.println("This is not a armstrong number");
        }
        }
    }

