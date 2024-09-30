import java.util.Scanner;

public class Q8OddNumberBetween {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your first number");
        int n =sc.nextInt();
        System.out.println("Enter your second number");
        int n1= sc.nextInt();
        System.out.print("Odd number =");
        for (int i = n; i <=n1 ; i++) {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
        }

    }
}
