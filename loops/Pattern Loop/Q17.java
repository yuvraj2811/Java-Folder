import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        int n;
        int a=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(a);a++;
            }
            a=1+i;
            System.out.println();
        }
    }
}
