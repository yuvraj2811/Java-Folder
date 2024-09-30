import java.util.Scanner;

public class Q15 {
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

        int b;
        if (n%2!=0){b=n;}
        else {b=n-1;}
        for (int i = 1; i <n ; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=b ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            b=b-2;
        }
    }
}
