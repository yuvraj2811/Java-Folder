import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n ; j++) {
                System.out.printf("%c",a);
                a++;
            }
            a= 65+i;
            System.out.println();
        }

    }
}
