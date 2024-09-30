import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int a;
        if (n%2!=0){a=n+2;}
        else {a=n+3;}
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a=a-2;
        }
    }
}
