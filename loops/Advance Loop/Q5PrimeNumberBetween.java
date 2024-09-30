import java.util.Scanner;

public class Q5PrimeNumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n =sc.nextInt();
        System.out.println("Enter your secocnd number");
        int n1 =sc.nextInt();
        int count=0;
        System.out.println("Prime NUmber =");
        while (true) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(n);
            }
            count=0;
            if (n==n1){break;}
            n++;
        }
    }
}
