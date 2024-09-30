import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(a);a++;
            }
            a=1+i;
            System.out.println();
        }
    }
}
