import java.util.Scanner;

public class Q10PrimeAndFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        while (true) {
            int a = sc.nextInt();
            if (n < 0 || n == 0||a==0||a<0) {

                System.out.println("You give negative or 0 stop the program");
                break;
            }

        }
    }
}
