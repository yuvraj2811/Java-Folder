import java.util.Scanner;

public class Q2PrintTillUser {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.println(i+" ");
        }

    }
}
