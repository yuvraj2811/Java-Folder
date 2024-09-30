import java.util.Scanner;

public class Q23TakeInputTillNegative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 2; ) {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n>0){}
            else {
                System.out.println("You give a negative number stop");
                break;
            }

        }
    }
}
