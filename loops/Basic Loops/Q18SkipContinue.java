import java.util.Scanner;

public class Q18SkipContinue {
    public static void main(String[] args) {
        System.out.println("Enter your number you want to skip");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (i%n==0){continue;}
            else {
                System.out.println(i);
            }
        }

    }
}
