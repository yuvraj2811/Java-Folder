import java.util.Scanner;

public class Q9CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n = sc.nextInt();
        System.out.println("Enter your second number");
        int n1 =sc.nextInt();
        int count =0;

        for (int i = n+1; i <n1 ; i++) {
            count++;
        }
        System.out.print("Count = "+ count);
    }
}
