import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        for (int i=1; i <=n; i++) {
            for (int k = 1; k <i ; k++) {
                System.out.print(" ");
            }
            for(int j=i;j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
