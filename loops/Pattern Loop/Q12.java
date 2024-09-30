import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i <=n ; i++) {
            for (int k = i; k <n ; k++) {
                System.out.print("  ");//use double space
            }
            for (int j = 1; j <=a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a=a+2;
        }
    }
}
