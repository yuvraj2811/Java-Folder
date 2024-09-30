import java.util.Scanner;

public class Q4TakeNumber100Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        for (int i = 1; i <=100 ; i++) {
            System.out.println(n+" ");
        }
    }
}
