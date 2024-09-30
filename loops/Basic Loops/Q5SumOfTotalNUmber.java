import java.util.Scanner;
public class Q5SumOfTotalNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to print sum of all numbers");
        int n = sc.nextInt();
        int sum=0;

        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of all number is "+sum);
    }
}
